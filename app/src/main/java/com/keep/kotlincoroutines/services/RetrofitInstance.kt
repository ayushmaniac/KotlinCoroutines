package com.keep.kotlincoroutines.services

import com.keep.kotlincoroutines.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by ayushshrivastava on 19/07/20.
 */
class RetrofitInstance {

    private var retrofit: Retrofit? = null
    private val BASE_URL = Constants.BASE_URL

    fun getRetrofitInstance(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}