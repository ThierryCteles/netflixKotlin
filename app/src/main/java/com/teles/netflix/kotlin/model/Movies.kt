package com.teles.netflix.kotlin.model

import com.google.gson.annotations.SerializedName

//Valores Para a Lista de Filmes, e detalhes, carregados da Api


data class Categories(@SerializedName("category") val categories: List<Category>)

data class Category(@SerializedName("title") var name: String = "",
                    @SerializedName("movie") var movies: List<Movie> = arrayListOf())

data class Movie(var id: Int = 0,
                 @SerializedName("cover_url") var coverUrl: String = "",
                 var title: String = "",
                 var desc: String = "",
                 var cast: String = "")

data class MovieDetail(
        var id: Int = 0,
        @SerializedName("cover_url") var coverUrl: String = "",
        var title: String = "",
        var desc: String = "",
        var cast: String = "",
        @SerializedName("movie") val moviesSimilar: List<Movie>)