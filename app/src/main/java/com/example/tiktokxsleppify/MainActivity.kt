
package com.fixtok.tv

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import com.fixtok.tv.ui.theme.FixTokTheme

@OptIn(ExperimentalTvMaterial3Api::class)
class MainActivity : ComponentActivity() {
    private val viewModel: FixTokViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Keep screen on for video autoplay
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        setContent {
            FixTokTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    FixTokApp(viewModel = viewModel)
                }
            }
        }
    }
}
