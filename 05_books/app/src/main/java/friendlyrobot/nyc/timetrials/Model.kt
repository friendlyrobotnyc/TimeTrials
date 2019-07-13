package friendlyrobot.nyc.timetrials

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookResponse(
    val numFound: Int,
    val docs: Array<BookDoc>
)

@JsonClass(generateAdapter = true)
data class BookDoc(
    val title_suggest: String
) {
    fun toBook() = Book(title_suggest)
}

@JsonClass(generateAdapter = true)
data class Book(
    val title: String
)

