package friendlyrobot.nyc.timetrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    protected lateinit var bookService: BooksService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (applicationContext as TimeTrialApplication).component.inject(this)

        bookService.bookSearch("heinlein")
            .enqueue(object : Callback<BookResponse> {
            override fun onFailure(call: Call<BookResponse>, t: Throwable) {
                Log.e("ERROR", "EXCEP: ${t.localizedMessage}")
            }

            override fun onResponse(call: Call<BookResponse>, response: Response<BookResponse>) {
                Log.e("Success", "response: numFOund: ${response.body()?.numFound}")
            }
        })
    }
}
