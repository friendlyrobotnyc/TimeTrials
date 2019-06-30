package friendlyrobot.nyc.timetrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.moshi.JsonClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

@JsonClass(generateAdapter = true)
data class ApiBookResponse(
        val num_found : Int,
        val docs : Array<ApiDocument>
)

@JsonClass(generateAdapter = true)
data class ApiDocument(
        val title : String
)
