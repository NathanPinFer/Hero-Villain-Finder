package com.example.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("api/1054131985798305/search/{name}")
    suspend fun getSuperHero(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    @GET("api/1054131985798305/{id}")
    suspend fun getSuperHeroDetail(@Path("id") superheroId: String): Response<SuperheroDetailResponse>
}