package com.appname.di

import com.appname.data.remote.Webservice
import com.appname.utils.BASE_URL
import com.appname.utils.LiveDataCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author ashish on 03,August,2018
 */
@Module
object NetworkModule {

    /**
     * Provides the Post service implementation.
     * @param retrofit the Retrofit object used to instantiate the service
     * @return the Post service implementation.
     */
    @Provides
    @Reusable
    internal fun provideWebService(retrofit: Retrofit): Webservice {
        return retrofit.create(Webservice::class.java)
    }

    internal fun provideRetrofitInterface(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(LiveDataCallAdapterFactory())
                .build()
    }

}