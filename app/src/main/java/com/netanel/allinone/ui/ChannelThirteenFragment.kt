package com.netanel.allinone.ui

import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.annotation.RequiresApi
import com.netanel.allinone.databinding.FragmentChannelThirteenBinding
import com.netanel.allinone.intefaces.IOnBackPressed
import com.netanel.allinone.intefaces.InitFragments

class ChannelThirteenFragment : Fragment(), InitFragments, IOnBackPressed {
    private var _binding: FragmentChannelThirteenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentChannelThirteenBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showFrags(
            binding.webView,
            "https://13tv.co.il/live/",
            binding.progressBar
        )
        goBack(binding.webView)
    }
}