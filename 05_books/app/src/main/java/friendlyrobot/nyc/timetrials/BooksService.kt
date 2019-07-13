package friendlyrobot.nyc.timetrials

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksService {
    @GET("search.json")
    fun bookSearch(@Query("q") value: String) : Call<BookResponse>
}