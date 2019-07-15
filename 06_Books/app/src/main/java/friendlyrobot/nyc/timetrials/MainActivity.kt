package friendlyrobot.nyc.timetrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.moshi.Moshi
import kotlinx.android.synthetic.main.item_book.view.*

class MainActivity : AppCompatActivity() {

    private val bookAdapter: BookAdapter = BookAdapter()
    protected lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = bookAdapter

        //sample
        val moshi = Moshi.Builder().build()
        val bookResponse = moshi.adapter(BookResponse::class.java).fromJson(SAMPLE_DATA)
        bookResponse?.docs?.map { it.toBook() }?.toList()?.let { bookAdapter.add(it) }
    }
}

class BookAdapter : RecyclerView.Adapter<BookViewHolder>() {

    private val books = mutableListOf<Book>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : BookViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return BookViewHolder(inflater.inflate(R.layout.item_book, parent, false))
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        books.getOrNull(position)?.let { holder.bind(it) }
    }

    fun add(booksToAdd: List<Book>) {
        books.clear()
        books.addAll(booksToAdd)
        notifyDataSetChanged()
    }
}

class BookViewHolder(bookView: View) : RecyclerView.ViewHolder(bookView) {
    fun bind (book: Book) {
        itemView.bookTitle.text = book.title
    }
}
