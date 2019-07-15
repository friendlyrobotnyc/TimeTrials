package friendlyrobot.nyc.timetrials

import android.app.Application

class BookApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().application(this).build()
    }
}