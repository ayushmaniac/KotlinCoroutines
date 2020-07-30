package com.keep.kotlincoroutines.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.keep.kotlincoroutines.R
import com.keep.kotlincoroutines.data.Posts


/**
 * Created by ayushshrivastava on 31/07/20.
 */
class PostsAdapter(private val list : List<Posts>?) : RecyclerView.Adapter<PostsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder =
        PostsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_posts, parent, false))

    override fun getItemCount(): Int = list?.size ?: 0

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) = holder.bindPosts(list?.get(position)!!)
}