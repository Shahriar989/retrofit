package com.shahriar.a10_retrofit_class_29

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object{

        private var base_url= "https://jsonplaceholder.typicode.com/"

        private val retrofit: Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(base_url)
            .build()

        fun getPostDTO(): PostDTO= retrofit.create(PostDTO::class.java)
    }
}