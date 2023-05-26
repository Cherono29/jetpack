package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image()

        }
    }
}

@Composable
fun image() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "spongebob", fontSize = 30.sp)
        Image(painter = painterResource(id = R.drawable.spongebob), contentDescription = "Spongebob")
        
        Row() {
            Text(text = "Pizza", fontSize = 30.sp)
            Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "Pizza")
            
        }
    }
}



@Preview(showBackground = true)
@Composable
fun imagePreview(){
    image()
}
