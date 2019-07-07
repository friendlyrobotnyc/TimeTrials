package friendlyrobot.nyc.timetrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        searchResponseAdapter = SearchResponseAdapter()
        booksRV.layoutManager = LinearLayoutManager(this)
        booksRV.adapter = searchResponseAdapter

        //load fake data for now
        val moshi = Moshi.Builder().build()
        val sample = moshi.adapter(SearchResponse::class.java).fromJson(SAMPLE_DATA)
        sample?.docs?.toList()?.let{searchResponseAdapter.add(it)}
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