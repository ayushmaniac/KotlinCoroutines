package com.keep.kotlincoroutines.services

import com.keep.kotlincoroutines.data.Posts
import retrofit2.Response

/**
 * Created by ayushshrivastava on 31/07/20.
 */
class ApiHeler(private val appServices: AppServices) : ApiImplementation {

    override suspend fun getPostsBro() = appServices.getAllPhotos()

}