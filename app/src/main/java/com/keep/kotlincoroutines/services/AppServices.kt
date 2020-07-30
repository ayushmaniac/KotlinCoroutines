package com.keep.kotlincoroutines.services

import com.keep.kotlincoroutines.data.Posts
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by ayushshrivastava on 19/07/20.
 */
interface AppServices {

    @GET("/users/1/posts")
    suspend fun getAllPhotos(): List<Posts>

}