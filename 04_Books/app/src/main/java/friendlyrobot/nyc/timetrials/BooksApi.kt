package friendlyrobot.nyc.timetrials

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksApi {

    @GET("search.json")
    fun search(@Query("q") q: String) : Call<SearchResponse>

}


fun buildBooksApi() : BooksApi {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://openlibrary.org/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
    return retrofit.create(BooksApi::class.java)
}