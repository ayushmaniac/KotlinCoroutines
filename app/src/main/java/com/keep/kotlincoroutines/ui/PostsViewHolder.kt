package com.keep.kotlincoroutines.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.keep.kotlincoroutines.data.Posts
import kotlinx.android.synthetic.main.row_posts.view.*

/**
 * Created by ayushshrivastava on 31/07/20.
 */
class PostsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    fun bindPosts(posts: Posts) {
        itemView.tvTitle.text = posts.title
        itemView.tvBody.text = posts.body
    }

}