package com.shahriar.a10_retrofit_class_29

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RetrofitClientWithDI {

    private var base_url = "https://jsonplaceholder.typicode.com/"

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit.Builder {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(base_url)
    }

    @Provides
    @Singleton
    fun getPostDTO(retrofitBuilder: Retrofit.Builder): PostDTO {

        return retrofitBuilder.build().create(PostDTO::class.java)
    }

}