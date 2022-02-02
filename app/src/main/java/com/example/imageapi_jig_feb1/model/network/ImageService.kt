package com.example.imageapi_jig_feb1.model.network

import com.example.imageapi_jig_feb1.model.network.models.Image
import retrofit2.Response
import retrofit2.http.GET

interface ImageService {

    @GET("photos")
    suspend fun getImages(): Response<List<Image>>
}