package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class FoodActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            food()

        }
    }
}

@Composable
fun food(){
    Column(Modifier.padding(40.dp)) {
        Image(painter = painterResource(id = R.drawable.food), contentDescription = "pasta", modifier = Modifier.padding(10.dp))
        Image(painter = painterResource(id = R.drawable.food1), contentDescription = "Food" , modifier = Modifier.padding(10.dp))
        Image(painter = painterResource(id = R.drawable.food2), contentDescription = "pizza", modifier = Modifier.padding(10.dp))
        
    }
}


@Preview(showBackground = true)
@Composable
fun foodPreview(){
    food()
}
