package com.netanel.allinone.ui

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.netanel.allinone.databinding.FragmentWinnerBinding
import com.netanel.allinone.intefaces.IOnBackPressed
import com.netanel.allinone.intefaces.InitFragments

class WinnerFragment : Fragment(), InitFragments, IOnBackPressed {
    private var _binding: FragmentWinnerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWinnerBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showFrags(
            binding.webView,
            "https://www.winner.co.il/",
            binding.progressBar
        )
        goBack(binding.webView)
    }
}