package friendlyrobot.nyc.timetrials

import com.squareup.moshi.Moshi
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun `SearchResponse parse from json`() {

        val moshi = Moshi.Builder().build()
        val sample = moshi.adapter(SearchResponse::class.java).fromJson(SAMPLE_DATA)
        assertNotNull(sample)

        assertEquals(sample?.numFound, 4)
        assertEquals(sample?.docs?.get(0)?.title_suggest, "Starship Troopers")
    }
}
