package com.example.tiktokxsleppify

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface

@OptIn(ExperimentalTvMaterial3Api::class)
class MainActivity : ComponentActivity() {
    private val viewModel: FixTokViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Чтобы экран телевизора не гас во время просмотра видео
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                FixTokApp(viewModel = viewModel)
            }
        }
    }
}
