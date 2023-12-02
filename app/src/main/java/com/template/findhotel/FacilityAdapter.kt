package com.template.findhotel

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.template.findhotel.databinding.FacilityItemLayoutBinding

class FacilityAdapter(
    private val textsFacility: List<String>
): RecyclerView.Adapter<FacilityAdapter.FacilityViewHolder>() {
    class FacilityViewHolder(
        val binding: FacilityItemLayoutBinding
    ): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacilityViewHolder {
        val binding = FacilityItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return FacilityViewHolder(binding)
    }

    override fun getItemCount() = textsFacility.size


    override fun onBindViewHolder(holder: FacilityViewHolder, position: Int) {
        val text = textsFacility[position]
        holder.binding.facilitiesText.text = text
    }
}