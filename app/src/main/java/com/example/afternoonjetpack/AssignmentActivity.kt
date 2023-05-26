package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cartoon()


        }
    }
}

@Composable
fun cartoon(){
    var scrollState = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState).padding(10.dp)) {
        Card(modifier = Modifier.background(color = Color.White).padding(all = 20.dp)) {
            Row() {
                Text(text = "Atilla Starwar")
                Image(painter = painterResource(id = R.drawable.human), contentDescription = "human", modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(200.dp) )

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.background(color = Color.White).padding(all = 20.dp)) {
            Row() {
                Text(text = "Huckleberry")
                Image(painter = painterResource(id = R.drawable.huckle), contentDescription = "huckle", modifier = Modifier.size(200.dp))
                
            }
            
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.background(color = Color.White).padding(all = 20.dp)) {
            Row() {
                Text(text = "The simpsons")
                Image(painter = painterResource(id = R.drawable.simpson), contentDescription = "The simpsons", modifier = Modifier.size(200.dp))
                
            }
            
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.background(color = Color.White).padding(all = 20.dp)) {
            Row() {
                Text(text = "The American dad")
                Image(painter = painterResource(id = R.drawable.dad), contentDescription = "american", modifier = Modifier.size(200.dp))
                
            }
            
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.background(color = Color.White).padding(all = 20.dp)) {
            Row() {
                Text(text = "Rick and Morty")
                Image(painter = painterResource(id = R.drawable.rick), contentDescription = "rick", modifier = Modifier.size(200.dp))
                
            }
            
        }

    }
}


@Preview(showBackground = true)
@Composable
fun cartoonPreview(){
    cartoon()
}
