package friendlyrobot.nyc.timetrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.moshi.Moshi
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_book.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var bookAdapter: BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        bookAdapter = BookAdapter()
        recyclerView.adapter = bookAdapter

        val moshi = Moshi.Builder().build()
        val smallResponse = moshi.adapter<ApiBookResponse>(ApiBookResponse::class.java).fromJson(simpleSearchResponse)

        for (i in 1..10) {
            smallResponse?.docs?.forEach {
                bookAdapter.add(it.toBook())
            }
        }
        bookAdapter.notifyDataSetChanged()

        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(query: String?): Boolean {
                Log.e("MainActivity", "onQueryTextSubmit $query")
                bookAdapter.clear()
                indeterminateBar.visibility = View.VISIBLE
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })
    }
}

class BookAdapter : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    private val books = mutableListOf<Book>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val holder = BookViewHolder(inflater.inflate(R.layout.item_book, parent, false))
            return holder
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        books.getOrNull(position)?.let { holder.bind(it) }
    }

    class BookViewHolder(bookView: View) : RecyclerView.ViewHolder(bookView) {
        fun bind(book: Book) {
            itemView.book_title.text = book.title
        }
    }

    fun add(book: Book) {
        books.add(book)
    }

    fun addAllAndClear(booksToAdd: List<Book>) {
        books.clear()
        books.addAll(booksToAdd)
        notifyDataSetChanged()
    }

    fun clear() {
        books.clear()
        notifyDataSetChanged()
    }
}




