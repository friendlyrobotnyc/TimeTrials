package friendlyrobot.nyc.timetrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_search.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var searchResponseAdapter:SearchResponseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchResponseAdapter = SearchResponseAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = searchResponseAdapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {

                query?.let {

                    val call = buildBooksApi().search(it)
                    call.enqueue(object : Callback<SearchResponse>{
                        override fun onFailure(call: Call<SearchResponse>, t: Throwable) {
                            Log.e("Failure retrofit", "error: ${t.localizedMessage}", t)
                        }

                        override fun onResponse(
                            call: Call<SearchResponse>,
                            response: Response<SearchResponse>
                        ) {
                            response?.body()?.let {
                                searchResponseAdapter.add(it?.docs?.toList())
                                Log.e("onResponse retrofit", "response: ${it?.numFound}")
                            }
                        }

                    })
                }
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