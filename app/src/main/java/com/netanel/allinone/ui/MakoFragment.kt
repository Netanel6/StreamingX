package com.netanel.allinone.ui

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.netanel.allinone.databinding.FragmentMakoBinding
import com.netanel.allinone.intefaces.IOnBackPressed
import com.netanel.allinone.intefaces.InitFragments

class MakoFragment : Fragment(), InitFragments, IOnBackPressed {
    private var _binding: FragmentMakoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMakoBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showFrags(
            binding.webView,
            "https://www.mako.co.il/",
            binding.progressBar
        )
        goBack(binding.webView)
    }
}