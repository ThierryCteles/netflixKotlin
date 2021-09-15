package com.teles.netflix.kotlin

import com.teles.netflix.kotlin.model.Categories
import com.teles.netflix.kotlin.model.MovieDetail
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path



interface NetflixAPI {
    //Tela Principal
    @GET("home")
    fun listCategories(): Call<Categories>

    //Detalhes dos Filmes
    @GET("{id}")
    fun getMovieBy(@Path("id") id: Int): Call<MovieDetail>

}

fun retrofit() : Retrofit {
    return Retrofit.Builder()
            .baseUrl("https://tiagoaguiar.co/api/netflix/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}