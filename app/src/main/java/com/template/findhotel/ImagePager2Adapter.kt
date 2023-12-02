package com.template.findhotel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.template.findhotel.databinding.CarouselItemLayoutBinding

class ImagePager2Adapter(
    private val imagesUrl: List<String>
): RecyclerView.Adapter<ImagePager2Adapter.ImagePager2ViewHolder>() {
    class ImagePager2ViewHolder(
        val binding: CarouselItemLayoutBinding
    ): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagePager2ViewHolder {
        val binding = CarouselItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ImagePager2ViewHolder(binding)
    }

    override fun getItemCount() = imagesUrl.size

    override fun onBindViewHolder(holder: ImagePager2ViewHolder, position: Int) {
        val imageUrl = imagesUrl[position]
        Picasso.get().load(imageUrl).error(R.drawable.image_not_found).into(holder.binding.imageView)
    }
}