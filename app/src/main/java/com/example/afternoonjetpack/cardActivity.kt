package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class cardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycards()

        }
    }
}

@Composable
fun mycards(){
    var scrollstate = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollstate), horizontalAlignment = Alignment.CenterHorizontally) {
        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(all = 30.dp)
        ) {
            Column (modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Bulldog", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.food), contentDescription ="", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(all = 30.dp)) {
            Column (modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "German Shepherd", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.food2), contentDescription ="", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(all = 30.dp)) {
            Column (modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Husky", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.food1), contentDescription ="", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(all = 30.dp)) {
            Column (modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Pitbull", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.pizza), contentDescription ="", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(all = 30.dp)) {
            Column (modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Golden Retriever", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.pizza5), contentDescription ="", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))

            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun mycardsPreview(){
    mycards()
}