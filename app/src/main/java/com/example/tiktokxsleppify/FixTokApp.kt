package com.example.tiktokxsleppify

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

@Composable
fun FixTokApp(viewModel: FixTokViewModel) {
    val isSidebarOpen by viewModel.isSidebarOpen.collectAsState()
    val currentUrl by viewModel.currentUrl.collectAsState()

    Row(modifier = Modifier.fillMaxSize()) {
        if (isSidebarOpen) {
            SidePanel(
                onNavigate = { url -> viewModel.loadUrl(url) },
                onClose = { viewModel.toggleSidebar(false) }
            )
        }
        Box(modifier = Modifier.weight(1f)) {
            TikTokWebView(
                url = currentUrl,
                modifier = Modifier.fillMaxSize(),
                onOpenSidebar = { viewModel.toggleSidebar(true) },
                onFocusActions = { /* Резервное действие под пульт */ }
            )
        }
    }
}
