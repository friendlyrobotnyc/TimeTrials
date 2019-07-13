package friendlyrobot.nyc.timetrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_book.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    protected lateinit var bookService: BooksService

    protected lateinit var bookAdapter: BookAdapter
    protected lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (applicationContext as TimeTrialApplication).component.inject(this)

        bookAdapter = BookAdapter()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = bookAdapter

        bookService.bookSearch("heinlein")
            .enqueue(object : Callback<BookResponse> {
            override fun onFailure(call: Call<BookResponse>, t: Throwable) {
                Log.e("ERROR", "EXCEP: ${t.localizedMessage}")
            }

            override fun onResponse(call: Call<BookResponse>, response: Response<BookResponse>) {
                Log.e("Success", "response: numFOund: ${response.body()?.numFound}")
                response.body()?.docs?.map { it.toBook() }?.toList()?.let {
                    bookAdapter.add(it)
                }
            }
        })
    }
}

class BookAdapter : RecyclerView.Adapter<BookViewHolder> (){

    private val books = mutableListOf<Book>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
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

class BookViewHolder(bookItem: View) : RecyclerView.ViewHolder(bookItem){
    fun bind(book: Book) {
        itemView.bookTitle.text = book.title
    }
}