package com.rdx.virginemoney.ui.ViewPager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rdx.virginemoney.ui.PeopleFragment.PeopleFragment
import com.rdx.virginemoney.ui.RoomsFragment.RoomFragment
import com.google.android.material.tabs.TabLayoutMediator
import com.rdx.virginemoney.R
import com.rdx.virginemoney.databinding.FragmentViewpagerBinding


class ViewpagerFragment : Fragment() {


    private var _binding : FragmentViewpagerBinding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentViewpagerBinding.inflate(layoutInflater, container, false)


        val fragmentList = listOf(RoomFragment(), PeopleFragment())

        val adapter = ViewPagerAdapter(
            fragmentList,
            childFragmentManager,
            viewLifecycleOwner.lifecycle
        )

        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = getString(R.string.rooms).uppercase()
                1 -> tab.text = getString(R.string.people).uppercase()
            }
        }.attach()



        return binding.root
    }


}