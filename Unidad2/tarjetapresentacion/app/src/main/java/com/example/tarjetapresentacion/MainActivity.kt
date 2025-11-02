package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPresentacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Row (modifier = Modifier.padding(innerPadding)){
                       Tarjeta()
                    }
                }
            }
        }
    }
}

@Composable
fun Tarjeta(){

    Column(modifier = Modifier.fillMaxSize()
        .background(color = Color(0xFFF6EFD1))
        .padding(top = 150.dp)
        , horizontalAlignment = Alignment.CenterHorizontally
    ) {

        cajaTitulo()
        Spacer(Modifier.size(170.dp))
        cajaContacto()
    }

}


@Preview(showBackground = true ,widthDp = 360,
    heightDp = 640)
@Composable
fun TarjetaPreview() {
    Column(modifier = Modifier.fillMaxSize()
        .background(color = Color(0xFFF6EFD1))
        .padding(top = 150.dp)
        , horizontalAlignment = Alignment.CenterHorizontally
        ) {

        cajaTitulo()
        Spacer(Modifier.size(170.dp))
        cajaContacto()
    }


}

@Composable
fun cajaTitulo(){

    Column (modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id=R.drawable.android_logo),
            contentDescription = "Logo",
            modifier = Modifier.size(90.dp)
                .background(color = Color.DarkGray))
        Text(text = "Bogdan Tichieru",
            fontFamily = FontFamily.Serif,
            fontSize = 26.sp,
            modifier = Modifier.padding(top = 12.dp)
                )
        Text(text = "Android Developer Extraordinaire",
            color = Color(0xFF27524D),
            modifier = Modifier.padding(top = 12.dp))
    }


}

@Composable
fun cajaContacto(){

   Column (){


           Row (verticalAlignment = Alignment.CenterVertically)  {
               Icon(imageVector = Icons.Filled.Call,
                   tint = Color( 0xFF27524D),
                   contentDescription = "phone")

               Text(text="600600600",
                   color = Color(0xFF27524D),
                   modifier = Modifier.padding(start = 10.dp)
                  )

           }
           Row (modifier = Modifier.padding(top = 12.dp),
               verticalAlignment = Alignment.CenterVertically) {
               Icon(imageVector = Icons.Filled.Share,
                   contentDescription = "share",
                   tint = Color( 0xFF27524D))

               Text(text = "@AndroDev",
                   color = Color(0xFF27524D),
                   modifier = Modifier.padding(start = 10.dp))
           }

           Row (modifier = Modifier.padding(top = 12.dp),
               verticalAlignment = Alignment.CenterVertically){

               Icon(imageVector = Icons.Filled.Email,
                   contentDescription = "email",
                   tint = Color( 0xFF27524D))

               Text(text = "bogdan@developer.es",
                   color = Color(0xFF27524D),
                   modifier = Modifier.padding(start = 10.dp))
           }
       }




}
