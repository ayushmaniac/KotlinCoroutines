package com.keep.kotlincoroutines.services

import com.keep.kotlincoroutines.data.Posts

/**
 * Created by ayushshrivastava on 31/07/20.
 */
interface ApiImplementation {

    suspend fun getPostsBro(): List<Posts>

}