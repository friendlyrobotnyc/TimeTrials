package friendlyrobot.nyc.timetrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.moshi.Moshi
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_search_response.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var searchResponseAdapter:SearchResponseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(null)

        searchResponseAdapter = SearchResponseAdapter()
        booksRV.layoutManager = LinearLayoutManager(this)
        booksRV.adapter = searchResponseAdapter

        //load fake data for now
        val moshi = Moshi.Builder().build()
        val sample = moshi.adapter(SearchResponse::class.java).fromJson(SAMPLE_DATA)
        sample?.docs?.toList()?.let{searchResponseAdapter.add(it)}

        searchView.setOnQueryTextListener( object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(p0: String?): Boolean {
                Log.e("main act", "onQueryTextSubmit: ${p0}")

                val sample2 = moshi.adapter(SearchResponse::class.java).fromJson(SAMPLE_DATA2)
                sample2?.docs?.toList()?.let{searchResponseAdapter.add(it)}

                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                Log.e("main act", "onQueryTextChange: ${p0}")
                return false
            }

        })
    }
}

class SearchResponseAdapter : RecyclerView.Adapter<SearchResponseItem>() {

    private val bookDocs = mutableListOf<BookDoc>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResponseItem {
        val inflater = LayoutInflater.from(parent.context)
        return SearchResponseItem(inflater.inflate(R.layout.item_search_response, parent, false))
    }

    override fun getItemCount() = bookDocs.size

    override fun onBindViewHolder(holder: SearchResponseItem, position: Int) {
        bookDocs.getOrNull(position)?.let { holder.bind(it) }
    }

    fun add(items : List<BookDoc>) {
        bookDocs.clear()
        bookDocs.addAll(items)
        notifyDataSetChanged()
    }
}

class SearchResponseItem(searchItem: View) : RecyclerView.ViewHolder(searchItem) {

    fun bind(bookDoc: BookDoc) {
        itemView.titleText.text = bookDoc.title_suggest
    }
}