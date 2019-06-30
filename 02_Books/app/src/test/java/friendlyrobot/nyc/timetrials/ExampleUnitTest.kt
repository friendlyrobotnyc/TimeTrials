package friendlyrobot.nyc.timetrials

import com.squareup.moshi.Moshi
import okio.Okio
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun `Search Book response test `() {

        val myStream = ExampleUnitTest::class.java.getResourceAsStream("/search_resp.json")
        assertNotNull(myStream)

        val moshi = Moshi.Builder().build()
        val apiBookResponse = moshi.adapter<ApiBookResponse>(ApiBookResponse::class.java).fromJson(Okio.buffer(Okio.source(myStream)))

        assertNotNull(apiBookResponse)
        assertEquals(apiBookResponse!!.num_found, 4)
    }
}
