package com.kuluruvineeth.mvvmnews.ui

import androidx.lifecycle.ViewModel
import com.kuluruvineeth.mvvmnews.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}