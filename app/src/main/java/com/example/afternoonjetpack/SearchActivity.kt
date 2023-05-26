package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class SearchActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            app()

        }
    }
}

@Composable
fun app(){
    var scrollState = rememberScrollState()


    Column(modifier = Modifier
        .fillMaxSize()) {
        Text(text = "Dubai, Media city", fontWeight = FontWeight.ExtraBold, fontSize = 40.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier
            .horizontalScroll(scrollState)
            .padding(all = 20.dp)) {
            Card() {
                Image(painter = painterResource(id = R.drawable.food1), contentDescription = "food", modifier = Modifier.size(200.dp))
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.food2), contentDescription = "food1", modifier = Modifier.size(200.dp))
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.food), contentDescription = "food3", modifier = Modifier.size(200.dp))
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "pizza", modifier = Modifier.size(200.dp))
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Your usuals", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.horizontalScroll(scrollState)) {
            Card() {
                Image(painter = painterResource(id = R.drawable.delivery), contentDescription = "deliver", modifier = Modifier
                    .size(200.dp)
                    )
                
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.delivery2), contentDescription = "delivery", modifier = Modifier
                    .size(200.dp)
                    )

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.delivery3), contentDescription = "delivers", modifier = Modifier
                    .size(200.dp)
                    )

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.delivery4), contentDescription = "ready", modifier = Modifier
                    .size(200.dp)
                    )

            }
            
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Free Delivery", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.horizontalScroll(scrollState)) {
            Card() {
               Image(painter = painterResource(id = R.drawable.usual1), contentDescription = "usual1" , modifier = Modifier.size(200.dp))
                
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.usual2), contentDescription = "usual2", modifier = Modifier.size(200.dp))

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.usual3), contentDescription = "usual3", modifier = Modifier.size(200.dp))

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.usual4), contentDescription = "usual4", modifier = Modifier.size(200.dp))

            }
            Card() {
                Image(painter = painterResource(id = R.drawable.usual5), contentDescription = "usual", modifier = Modifier.size(200.dp))

            }
            Spacer(modifier = Modifier.height(10.dp))
            
        }

    }
}


@Preview(showBackground = true)
@Composable
fun appPreview(){
    app()
}
