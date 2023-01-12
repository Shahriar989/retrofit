package com.shahriar.a10_retrofit_class_29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shahriar.a10_retrofit_class_29.model.ResponsePosts
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dto: PostDTO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dto.getPosts().enqueue(object: Callback<ResponsePosts>{
            override fun onResponse(call: Call<ResponsePosts>, response: Response<ResponsePosts>) {

                Log.i("TAG", "post: ${response.body()}")
            }

            override fun onFailure(call: Call<ResponsePosts>, t: Throwable) {

                Log.i("TAG", "post: ${t.message}")
            }
        })


//        var posts = RetrofitClient.getPostDTO().getPosts().enqueue(object: Callback<ResponsePosts>{
//            override fun onResponse(call: Call<ResponsePosts>, response: Response<ResponsePosts>) {
//
//                Log.i("TAG", "post: ${response.body()}")
//            }
//
//            override fun onFailure(call: Call<ResponsePosts>, t: Throwable) {
//
//                Log.i("TAG", "post: ${t.message}")
//            }
//        })
    }
}