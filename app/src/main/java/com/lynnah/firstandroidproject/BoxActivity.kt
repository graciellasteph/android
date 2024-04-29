package com.lynnah.firstandroidproject

import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ComponentActivity
import com.Lynnah.firstandroidproject.ui.theme.FirstAndroidProjectTheme
import androidx.activity.compose.setContent as setContent

class BoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                }
            }
        }
    }


}
@Composable
fun ColorScreen(){
    Box (
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize()
    ){
        Box (
            modifier = Modifier
                .background(Color.Red)
                .width(200.dp)
                .height(200.dp)
        ){
          Box (
              modifier = Modifier
                  .background(Color.Green)
          ){

          }
        }

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColorSchemePreview(){
    ColorScreen()
}