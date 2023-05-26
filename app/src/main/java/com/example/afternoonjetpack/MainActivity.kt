package com.example.afternoonjetpack

import android.content.Intent
import android.os.Bundle
import android.text.style.UnderlineSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()
        }
    }
}

@Composable
fun text(){
    Image(painter = painterResource(id = R.drawable.ice), contentDescription = "ice", modifier = Modifier.fillMaxSize())
    val mContext= LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {
        //First Button
        Button(onClick = {
            mContext.startActivity(Intent(mContext,LayoutActivity::class.java))

        }, shape = RectangleShape) {
            Icon(imageVector = Icons.Default.ArrowBack ,contentDescription = "Arrowback" )
            Text(text = "Layout")
            
        }
        //Second Button
        Button(onClick = {
            mContext.startActivity(Intent(mContext,ImageActivity::class.java))

        }, shape = CircleShape) {
            Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "Circle")
            Text(text = "Image")

        }
        //Third Button
        Button(onClick = {
            mContext.startActivity(Intent(mContext,PizzaActivity::class.java))

        }, shape = RectangleShape) {
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "forward")
            Text(text = "Pizza")

        }
        //Fourth button
        Button(onClick = {
            mContext.startActivity(Intent(mContext,TextFieldActivity::class.java))

        }) {
            Text(text = "Form")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext,AssignmentActivity::class.java))

        }) {
            Text(text = "Cartoon")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext,SearchActivity::class.java))

        }) {
            Text(text = "Hotel")

        }



    }

}



@Preview(showBackground = true)
@Composable
fun textPreview(){
    text()

}