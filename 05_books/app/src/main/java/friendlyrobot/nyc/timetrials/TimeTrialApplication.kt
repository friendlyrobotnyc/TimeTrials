package friendlyrobot.nyc.timetrials

import android.app.Application
import android.util.Log
import friendlyrobot.nyc.timetrials.di.ApplicationComponent

class TimeTrialApplication : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        Log.e("TimeTrialApplication", "onCreate()")
        component = DaggerApplicationComponent
            .builder()
            .application(this)
            .build()
    }
}