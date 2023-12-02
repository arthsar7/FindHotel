package com.template.findhotel

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.flexbox.FlexboxLayoutManager
import com.template.findhotel.databinding.FragmentHotelBinding

class HotelFragment: Fragment() {
    private var _binding: FragmentHotelBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHotelBinding.inflate(inflater, container, false)
        val imagesUrl = listOf(
            "https://www.atorus.ru/sites/default/files/upload/image/News/56149/Club_Priv%C3%A9_by_Belek_Club_House.jpg",
            "https://deluxe.voyage/useruploads/articles/The_Makadi_Spa_Hotel_02.jpg",
            "https://deluxe.voyage/useruploads/articles/article_1eb0a64d00.jpg"
        )
        binding.viewPager.adapter = ImagePager2Adapter(imagesUrl)
        val facilities = listOf(
            "3-я линия",
            "Платный Wi-Fi в фойе",
            "30 км до аэропорта",
            "1 км до парковки",
        )
        val facilitiesAdapter = FacilityAdapter(facilities)
        binding.viewPager.addItemDecoration(
            DotsIndicatorDecoration(
                10,
                10,
                10,
                R.color.gray_color,
                R.color.black
            )
        )
        binding.facilities.adapter = facilitiesAdapter
        binding.facilities.layoutManager = FlexboxLayoutManager(requireContext())
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_hotelFragment_to_chooseRoomFragment)
        }
        return binding.root
    }
}