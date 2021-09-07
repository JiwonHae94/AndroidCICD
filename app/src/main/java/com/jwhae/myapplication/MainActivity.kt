package com.jwhae.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jwhae.myapplication.ui.theme.Mobile_cicdTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContent {
            MessageCard("Jiwon")
        }*/
    }
}

data class Message(val author : String, val msg : String)

@Preview
@Composable
fun DefaultPreview(){
    Mobile_cicdTheme{
        MessageCard(Message(author = "Jiwon", msg = "TEST"))
    }
}

@Composable
fun MessageCard(msg : Message){
    Row{
        Image(
            painter = painterResource(R.drawable.iu),
            contentDescription = "TEST",
            modifier = Modifier.size(40.dp).clip(CircleShape).align(Alignment.CenterVertically)
        )
        Column{
            Spacer(Modifier.height(1.dp))
            Text(text = "Hello ${msg.author}")
            Spacer(Modifier.height(1.dp))
            Text(text = "msg from : ${msg.msg}")
            Spacer(Modifier.height(1.dp))
        }
    }

}