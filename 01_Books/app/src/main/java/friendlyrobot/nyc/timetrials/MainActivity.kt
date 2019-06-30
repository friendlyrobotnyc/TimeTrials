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
import kotlinx.android.synthetic.main.view_book.view.*

class MainActivity : AppCompatActivity() {


    private lateinit var myadapter : MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myadapter = MyAdapter()
        mylist.layoutManager = LinearLayoutManager(this)
        mylist.adapter = myadapter


        val moshi = Moshi.Builder().build()
        val bookSearchResponse = moshi.adapter<BookSearchResponse>(BookSearchResponse::class.java).fromJson(silly)

        val listOfBooks = mutableListOf<Book>()
        bookSearchResponse?.docs?.forEach { listOfBooks.add(it.toBook()) }
        myadapter.clearAndAdd(listOfBooks)
    }
}

class MyAdapter : RecyclerView.Adapter<BookDocumentVH>() {

    private val books:MutableList<Book> = mutableListOf<Book>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookDocumentVH {

        val myview = LayoutInflater.from(parent.context).inflate(R.layout.view_book, parent, false)

        return BookDocumentVH(myview)
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BookDocumentVH, position: Int) {
        holder.bind(books[position])
    }

    fun clearAndAdd(booksToAdd: List<Book>) {
        books.clear()
        books.addAll(booksToAdd)
        notifyDataSetChanged()
    }
}

class BookDocumentVH(bookDoc : View) : RecyclerView.ViewHolder(bookDoc) {

    fun bind(book: Book) {
        itemView.book_title.text = book.title
    }
}
