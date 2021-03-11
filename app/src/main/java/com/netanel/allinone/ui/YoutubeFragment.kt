package com.netanel.allinone.ui

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.netanel.allinone.databinding.FragmentYoutubeBinding
import com.netanel.allinone.intefaces.IOnBackPressed
import com.netanel.allinone.intefaces.InitFragments

class YoutubeFragment : Fragment(), InitFragments, IOnBackPressed {
    private var _binding: FragmentYoutubeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentYoutubeBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showFrags(
            binding.webView,
            "https://www.youtube.co.il",
            binding.progressBar
        )
        goBack(binding.webView)
    }
}