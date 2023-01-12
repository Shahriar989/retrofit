package com.shahriar.a10_retrofit_class_29

import com.shahriar.a10_retrofit_class_29.model.ResponsePosts
import retrofit2.Call
import retrofit2.http.GET

interface PostDTO {

    @GET("/posts")
    fun getPosts(): Call<ResponsePosts>
}