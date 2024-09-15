package com.example.mipt1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mipt1.ui.theme.MIPT1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MIPT1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainContent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    val displayText = remember { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        Text(text = displayText.value)

        Button(
            onClick = { displayText.value = "Pirmas darbas" },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Mygtukas")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainContentPreview() {
    MIPT1Theme {
        MainContent()
    }
}