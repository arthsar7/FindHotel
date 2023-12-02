package com.template.findhotel

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ChooseRoomFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseRoomFragment()
    }

    private lateinit var viewModel: ChooseRoomViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_choose_room, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChooseRoomViewModel::class.java)
        // TODO: Use the ViewModel
    }

}