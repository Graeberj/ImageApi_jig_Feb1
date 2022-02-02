package com.example.imageapi_jig_feb1.view.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imageapi_jig_feb1.databinding.ItemImageBinding
import com.example.imageapi_jig_feb1.model.network.models.Image
import com.example.imageapi_jig_feb1.view.ImageFragment
import kotlinx.coroutines.withContext

class ImageAdapter(
    private val imageList: List<Image>
) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ImageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemImageBinding.inflate(inflater, parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(imageList[position])

    }

    override fun getItemCount(): Int {
       return imageList.size
    }


    class ImageViewHolder(private val binding: ItemImageBinding):
        RecyclerView.ViewHolder(binding.root){

        @SuppressLint("SetTextI18n")
        fun bind(image: Image){
            with(binding){
                idTv.text = "Image ID ${image.id}"
                albumIdTv.text = "Album ID: ${image.albumId}"
                imageTitleTv.text = image.title

                Glide.with(urlIv.context)
                    .load("${image.url}.png")
                    .into(urlIv)

            }
        }
    }
}