package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myText()

            }
        }
    }


@Composable
fun myText(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Gray)) {
        Text(text = "Hello there!", fontSize = 30.sp, color = Color.Magenta, fontStyle = FontStyle.Italic)
        Text(text = "Interesting", fontSize = 40.sp, color = Color.Magenta, fontStyle = FontStyle.Italic)
        Text(text = "Hello world!", fontSize = 40.sp, color = Color.Magenta, fontStyle = FontStyle.Italic)
        Text(text = "Activity", fontSize = 40.sp, color = Color.Magenta, fontStyle = FontStyle.Italic)
        Text(text = "Android", fontSize = 40.sp, color = Color.Magenta, fontStyle = FontStyle.Italic)
        Row(modifier = Modifier.background(color = Color.DarkGray).fillMaxWidth()){
            Text(text = "True")
            Text(text = "False")
        }
    }

}


@Preview(showBackground = true)
@Composable
fun myTextPreview(){
    myText()
}

