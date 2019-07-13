package friendlyrobot.nyc.timetrials.di

import dagger.Module
import dagger.Provides
import friendlyrobot.nyc.timetrials.BooksService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
object ApplicationModule {

    @JvmStatic
    @Provides
    @Singleton
    fun providesBookService(retrofit: Retrofit) : BooksService {
        return retrofit.create(BooksService::class.java)
    }

    @JvmStatic
    @Provides
    @Singleton
    fun providesRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl("https://openlibrary.org/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}