package friendlyrobot.nyc.timetrials

import com.squareup.moshi.Moshi
import okio.Okio
import org.junit.Test

import org.junit.Assert.*

class ModelTest {

    @Test
    fun `Search Book response test `() {

        val myStream = ModelTest::class.java.getResourceAsStream("/search_resp.json")
        assertNotNull(myStream)

        val moshi = Moshi.Builder().build()
        val apiBookResponse = moshi.adapter<ApiBookResponse>(ApiBookResponse::class.java).fromJson(Okio.buffer(Okio.source(myStream)))

        assertNotNull(apiBookResponse)
        assertEquals(apiBookResponse!!.num_found, 4)
    }
}
