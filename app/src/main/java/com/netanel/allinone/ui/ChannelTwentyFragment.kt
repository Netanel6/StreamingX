package com.netanel.allinone.ui

import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.annotation.RequiresApi
import com.netanel.allinone.databinding.FragmentChannelTwentyBinding
import com.netanel.allinone.intefaces.IOnBackPressed
import com.netanel.allinone.intefaces.InitFragments

class ChannelTwentyFragment : Fragment(), InitFragments, IOnBackPressed {
    private var _binding: FragmentChannelTwentyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChannelTwentyBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showFrags(
            binding.webView,
            "https://www.20il.co.il/tochniot_meleot/%D7%A9%D7%99%D7%93%D7%95%D7%A8-%D7%97%D7%99/",
            binding.progressBar
        )
        goBack(binding.webView)
    }
}