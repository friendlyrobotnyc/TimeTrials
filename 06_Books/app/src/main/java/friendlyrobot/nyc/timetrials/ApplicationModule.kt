package friendlyrobot.nyc.timetrials

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
object ApplicationModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideRetrofit()  = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl("https://openlibrary.org/")
        .build()

    @JvmStatic
    @Provides
    @Singleton
    fun provideBookService(retrofit: Retrofit) : BookService {
        return retrofit.create(BookService::class.java)
    }
}