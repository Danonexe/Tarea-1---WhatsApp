package com.example.practica

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

import com.example.practica.ui.theme.PracticaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    App()
}
@Composable
fun ContactList() {
    val contactos = stringArrayResource(R.array.contactos)

    Column(modifier = Modifier.padding(12.dp,10.dp,2.dp,2.dp)) {
        contactos.forEach { contacto ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.size(18.dp)
                )
                Text(
                    text = contacto,
                    modifier = Modifier.padding(8.dp,0.dp)
                )
            }
        }
    }
}

@Composable
fun App() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF075E54))
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
                    Text(color = Color.White, text = stringResource(R.string.inicio))
                    Spacer(Modifier.weight(1F))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Call,
                            contentDescription = null,
                            tint = (Color.White),
                            modifier = Modifier.size(15.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            tint = (Color.White),
                            modifier = Modifier.size(18.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = null,
                            tint = (Color.White),
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
                Row(Modifier.padding(8.dp,3.dp,8.dp,0.dp)) {
                    Text(
                        color = Color.White,
                        text = stringResource(R.string.llamadas),
                        fontSize = 10.sp
                    )
                    Spacer(Modifier.weight(1F))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            color = Color.White,
                            text = stringResource(R.string.chats),
                            fontSize = 10.sp
                        )
                        Box(
                            modifier = Modifier
                                .width(50.dp)
                                .height(2.dp)
                                .background(Color.White)
                        )
                    }
                    Spacer(Modifier.weight(1F))
                    Text(
                        color = Color.White,
                        text = stringResource(R.string.contactos),
                        fontSize = 10.sp
                    )
                }
            }
        }
        ContactList()
    }
}
