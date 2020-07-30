package com.keep.kotlincoroutines.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.keep.kotlincoroutines.data.Posts
import com.keep.kotlincoroutines.services.AppServices

/**
 * Created by ayushshrivastava on 31/07/20.
 */

class MainActivityViewModel : ViewModel() {

    var list : MutableLiveData<List<Posts>> = MutableLiveData()

    suspend fun getPosts(){
    }
}