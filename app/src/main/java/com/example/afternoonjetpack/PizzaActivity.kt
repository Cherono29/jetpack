package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class PizzaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            pizza()

        }
    }
}

@Composable
fun pizza(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.DarkGray)) {
        Image(painter = painterResource(id = R.drawable.pizza5), contentDescription = "Pizza", Modifier.fillMaxWidth())
        Text(text = "Homemade veg pizza", fontSize = 50.sp, color = Color.White)
        Text(text = "Pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly.", fontSize = 30.sp, color = Color.White)

    }
}


@Preview(showBackground = true)
@Composable
fun PizzaPreview(){
    pizza()
}
