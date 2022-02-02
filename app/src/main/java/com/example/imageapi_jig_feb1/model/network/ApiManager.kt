package com.example.imageapi_jig_feb1.model.network

import com.example.imageapi_jig_feb1.model.network.RetrofitInstance
class ApiManager {

    private var imageService: ImageService =
        RetrofitInstance.providesRetrofit().create(ImageService::class.java)

    suspend fun getImages() = imageService.getImages()
}