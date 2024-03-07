package br.com.fiap.carbonpath.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle


@Composable
fun LayoutScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            /*.background(Color.Cyan)*/
            .padding(start = 16.dp, top = 16.dp)
    ) {
        HeaderSection()
        ContentSection()
        BlackColumn()
    }
}

@Composable
fun HeaderSection() {
    Column(
        modifier = Modifier
            /*.background(Color.Magenta)*/
            .fillMaxWidth()
            .height(40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Carbon Path",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
    }
}

@Composable
fun ContentSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
        /* .background(Color.Green)*/
    ) {
/* Image(   ESSA PARTE NÃO ESTÁ FUNCIONANDO
     painter = painterResource(id =R.drawable.imagem),
     contentDescription = "Cidade verde",
     modifier = Modifier
         .size(300.dp)
         .align(Alignment.CenterHorizontally)
 )*/
        BlackColumn()
    }
}

@Composable
fun BlackColumn() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(Color.Black)
    )
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column {
                Text(
                    text = "Desafio do mês",
                    color = Color(0xFF08E000),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)
                        .width(150.dp)
                        .height(200.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(16.dp)
                        )
                )
                Text(
                    text = "Subtítulo",
                    color = Color.Black,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(start = 8.dp, top = 4.dp)
                        .background(Color.Magenta)
                        .padding(8.dp)
                )
            }

            Text(
                text = "Pegada de Carbono",
                color = Color(0xFF08E000),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
                    .width(150.dp)
                    .height(200.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(16.dp)
                    )
            )
        }



    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview() {
    LayoutScreen()
}


