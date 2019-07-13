package friendlyrobot.nyc.timetrials.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import friendlyrobot.nyc.timetrials.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        fun build() : ApplicationComponent

        @BindsInstance
        fun application(appContext: Context): Builder
    }

    fun inject(mainActivity: MainActivity)
}