package friendlyrobot.nyc.timetrials

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        fun build() : ApplicationComponent

        @BindsInstance
        fun application(appContext: Context) : Builder
    }

    fun inject(mainActivity: MainActivity)
}