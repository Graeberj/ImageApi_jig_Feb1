package com.example.imageapi_jig_feb1.model.repository

import com.example.imageapi_jig_feb1.model.network.ApiManager
import com.example.imageapi_jig_feb1.model.network.models.Image
import java.lang.Exception

class ImageRepository(
    private val apiManager: ApiManager
) {
    suspend fun getImages(): List<Image>? {
        return try {
            val response = apiManager.getImages()
            if (response.isSuccessful) {
                response.body()
            } else {
                emptyList()
            }
        } catch(ex: Exception) {
            emptyList()
        }
    }
}