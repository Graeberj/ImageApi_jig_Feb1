package com.example.imageapi_jig_feb1.model.network.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Image(
    val albumId: Int,
    val id: Int,
    val title: String,
    val url: String,
    val thumbnailUrl: String
)


