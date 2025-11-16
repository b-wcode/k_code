package com.example.cuadriculadecursos

import DataSource.topics
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadriculadecursos.ui.theme.CuadriculadeCursosTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadriculadeCursosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Cuadricula(
                      modifier = Modifier.padding(vertical = innerPadding.calculateTopPadding(),
                          horizontal = 8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Cuadricula( modifier: Modifier = Modifier) {
    LazyVerticalGrid(GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier) {



        items(topics){ topic->

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),
                modifier = Modifier
                    .size(width = 180.dp, height = 68.dp)


            ) {

             Row (modifier=Modifier.fillMaxSize()) {

                 Image(painter=painterResource(topic.imageRes),
                     contentDescription = null,
                     modifier = Modifier.size(68.dp),
                     contentScale = ContentScale.Crop
                         )

                 Column(horizontalAlignment = Alignment.Start,
                      verticalArrangement = Arrangement.Bottom,
                     modifier = Modifier.fillMaxSize()
                         .padding(start = 16.dp)
                    ) {


                     Text(
                         text = stringResource(topic.name),
                         textAlign = TextAlign.Center,
                         modifier=Modifier.padding(top = 16.dp)
                     )

                     Row (verticalAlignment = Alignment.CenterVertically,
                         horizontalArrangement = Arrangement.Start,
                         modifier = Modifier.fillMaxSize()

                     ){

                         Icon(
                             painter = painterResource(R.drawable.ic_grain),
                             contentDescription = null,

                             )

                       Text(text = topic.availableCourses.toString(),
                        textAlign = TextAlign.Center)



                     }

                 }

             }



            }


        }


    }

}

@Preview(showBackground = true)
@Composable
fun CuadriculaPreview() {

 Cuadricula(modifier=Modifier.fillMaxSize())
}