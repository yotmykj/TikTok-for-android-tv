package com.example.tiktokxsleppify

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class FixTokViewModel : ViewModel() {
    private val _isSidebarOpen = MutableStateFlow(false)
    val isSidebarOpen: StateFlow<Boolean> = _isSidebarOpen.asStateFlow()

    private val _currentUrl = MutableStateFlow("https://www.tiktok.com/")
    val currentUrl: StateFlow<String> = _currentUrl.asStateFlow()

    fun toggleSidebar(open: Boolean) {
        _isSidebarOpen.value = open
    }

    fun loadUrl(url: String) {
        _currentUrl.value = url
        _isSidebarOpen.value = false
    }
}
