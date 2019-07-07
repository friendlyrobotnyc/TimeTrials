package friendlyrobot.nyc.timetrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.moshi.Moshi
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_search.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var searchResponseAdapter:SearchResponseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchResponseAdapter = SearchResponseAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = searchResponseAdapter

        val moshi = Moshi.Builder().build()
        val searchSample = moshi.adapter(SearchResponse::class.java).fromJson(SAMPLE_DATA)
        searchResponseAdapter.add(searchSample!!.docs.toList())

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {

                val sampleTwo = moshi.adapter(SearchResponse::class.java).fromJson(SAMPLE_DATA2)
                searchResponseAdapter.add(sampleTwo!!.docs.toList())

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                return false
            }

        })
    }
}


class SearchResponseAdapter : RecyclerView.Adapter<SearchItem>() {

    private val books = mutableListOf<BookDocument>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchItem {
        val inflater = LayoutInflater.from(parent.context)
        return SearchItem(inflater.inflate(R.layout.item_search, parent, false))
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: SearchItem, position: Int) {
        books?.getOrNull(position)?.let { holder.bind(it) }
    }

    fun add(bookDocument: List<BookDocument>) {
        books.clear()
        books.addAll(bookDocument)
        notifyDataSetChanged()
    }

}

class SearchItem(searchItem: View) : RecyclerView.ViewHolder(searchItem) {

    fun bind(bookDocument: BookDocument) {
        itemView.titleText.text = bookDocument.title_suggest
    }
}