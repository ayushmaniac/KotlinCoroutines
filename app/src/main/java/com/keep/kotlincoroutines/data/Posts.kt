package com.keep.kotlincoroutines.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


/**
 * Created by ayushshrivastava on 19/07/20.
 */
data class Posts (

    @SerializedName("userId")
    @Expose
     var userId: Int? = null,

    @SerializedName("id")
    @Expose
     var id: Int? = null,

    @SerializedName("title")
    @Expose
     var title: String? = null,

    @SerializedName("body")
    @Expose
     var body: String? = null

)