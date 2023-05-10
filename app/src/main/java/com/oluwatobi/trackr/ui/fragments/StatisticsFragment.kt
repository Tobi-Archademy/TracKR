package com.oluwatobi.trackr.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.oluwatobi.trackr.R
import com.oluwatobi.trackr.ui.viewmodels.MainViewModel
import com.oluwatobi.trackr.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}