package friendlyrobot.nyc.timetrials

import com.squareup.moshi.Moshi
import org.junit.Test

import org.junit.Assert.*

class SearchResponseTest {

    @Test
    fun `hydrate SearchResponse from json string`() {

        val moshi = Moshi.Builder().build()
        val searchSample = moshi.adapter(SearchResponse::class.java).fromJson(SAMPLE_DATA)
        assertNotNull(searchSample)
        assertEquals(searchSample!!.numFound, 4)
        assertEquals(searchSample.docs.get(0).title_suggest, "The man who sold the moon")
    }
}
