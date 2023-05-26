package com.example.afternoonjetpack

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class TextFieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            form()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun form() {
    val mContext = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
            .padding(50.dp)
    ) {

        Text(
            text = "PERSONAL DETAILS",
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        //Firstname
        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(text = "Firstname:") },
            placeholder = { Text(text = "Enter firstname") },
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "icon") },
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon") },
            textStyle = TextStyle(color = Color.DarkGray, fontStyle = FontStyle.Italic),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier.padding(20.dp)
        )
        var mname by remember { mutableStateOf("") }
        TextField(
            value = mname,
            onValueChange = { mname = it },
            label = { Text(text = "Middlename:") },
            placeholder = { Text(text = "Enter middlename") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "icon") },
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon") },
            textStyle = TextStyle(color = Color.DarkGray, fontStyle = FontStyle.Italic),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier.padding(20.dp)
        )
        var lname by remember { mutableStateOf("")}
        TextField(
            value = lname,
            onValueChange = {lname=it},
            label = { Text(text = "Lastname:")},
            placeholder = {Text(text = "Enter lastname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.DarkGray, fontStyle = FontStyle.Italic),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier.padding(20.dp)
        )
        var email by remember { mutableStateOf("")}
        TextField(
            value = email,
            onValueChange = {email=it},
            label = { Text(text = "Email:")},
            placeholder = {Text(text = "Enter email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.DarkGray, fontStyle = FontStyle.Normal),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.padding(20.dp)
        )
        var password by remember { mutableStateOf("")}
        TextField(
            value = password,
            onValueChange = {password=it},
            label = { Text(text = "Password:")},
            placeholder = {Text(text = "Enter your password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.DarkGray, fontStyle = FontStyle.Normal),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.padding(20.dp),

        )
        var phone by remember { mutableStateOf("")}
        TextField(
            value = phone,
            onValueChange = {phone=it},
            label = { Text(text= "Phone Number:")},
            placeholder = {Text(text = "Enter your contact")},
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.DarkGray, fontStyle = FontStyle.Normal),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            modifier = Modifier.padding(20.dp)
        )
        Button(onClick = {mContext.startActivity(Intent(mContext,PizzaActivity::class.java))}) {
            Text(text = "Submit")
            
        }

    }

}

@Preview(showBackground = true)
@Composable
fun formPreview(){
    form()
}
