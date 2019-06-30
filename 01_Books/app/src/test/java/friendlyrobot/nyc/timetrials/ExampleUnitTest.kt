package friendlyrobot.nyc.timetrials

import com.squareup.moshi.Moshi
import okio.Okio
import org.junit.Test

import org.junit.Assert.*
import java.io.InputStream

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun BookSearchResponse() {

        val myStream = inputStream("/search_response.json")
        assertNotNull(myStream)

        val moshi = Moshi.Builder().build()
        val booksearchResponse = moshi.adapter<BookSearchResponse>(BookSearchResponse::class.java)
            .fromJson(Okio.buffer(Okio.source(myStream)))

        assertNotNull(booksearchResponse)
        assertEquals(booksearchResponse!!.num_found, 336)
    }

    private fun inputStream(path: String): InputStream {
        return ExampleUnitTest::class.java!!.getResourceAsStream(path)
    }

}
