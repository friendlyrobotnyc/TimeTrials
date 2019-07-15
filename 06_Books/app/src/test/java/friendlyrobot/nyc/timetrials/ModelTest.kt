package friendlyrobot.nyc.timetrials

import com.squareup.moshi.Moshi
import org.junit.Test

import org.junit.Assert.*

class ModelTest {

    val moshi = Moshi.Builder().build()

    @Test
    fun `parse sample into datamodel`() {
        val bookResponse = moshi.adapter(BookResponse::class.java).fromJson(SAMPLE_DATA)
        assertEquals(bookResponse?.numFound, 8)
        assertEquals(bookResponse?.docs?.getOrNull(0)?.toBook()?.title, "Starman Jones")
    }
}
