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
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.carbonpath.R
import java.time.format.TextStyle


@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp)
    ) {
        HeaderSection()
        ContentSection()
        InfoSection()
        HankingSection()
        MenuNavegacao()
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
    ) {
    Image(
     painter = painterResource(id = R.drawable.imagem),
     contentDescription = "Cidade verde",
     modifier = Modifier
         .fillMaxWidth()
         .height(200.dp)
         .align(Alignment.CenterHorizontally)
 )
    }
}

@Composable
fun InfoSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp, bottom = 12.dp)
    )
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(end = 12.dp)
                    .width(154.dp)
                    .height(96.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(8.dp)
                    )
            ){
                Text(
                    text = "Desafio do mês",
                    color = Color(0xFF08E000),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                Text(
                    text = "Progresso: 12%",
                    color = Color.Black,
                    fontSize = 16.sp
                )
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp)
                    .width(154.dp)
                    .height(96.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(8.dp)
                    )
            ) {
                Text(
                    text = "Pegada de Carbono",
                    color = Color(0xFF08E000),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                Text(
                    text = "XX,XX",
                    color = Color.Black,
                    fontSize = 16.sp
                )
            }
        }



    }
}
@Composable
fun HankingSection() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp, bottom = 12.dp)

    ){

        Row (
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    colorResource(id = R.color.verde),
                    RoundedCornerShape(8.dp, 8.dp)
                )
                .border(
                    1.dp,
                    Color.Black,
                    RoundedCornerShape(8.dp, 8.dp)
                )
        ){
            Text(
                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
                text = "Hanking",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.white))
        }
        PessoaHanking(nome = "Jane Doe", colocacao = "1")
        PessoaHanking(nome = "John Doe", colocacao = "2")
        PessoaHanking(nome = "Jane Doe", colocacao = "3")
        PessoaHanking(nome = "John Doe", colocacao = "4")
        PessoaHanking(nome = "Jane Doe", colocacao = "5")
        PessoaHanking(nome = "John Doe", colocacao = "6")
        PessoaHanking(nome = "Jane Doe", colocacao = "7")

        Row (
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    1.dp, Color.Black,
                    RoundedCornerShape(0.dp, 0.dp, 8.dp, 8.dp)
                )
        ){
            Text(
                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
                text = "Ver mais",
                fontSize = 16.sp,
                color = colorResource(id = R.color.verde)
            )
        }
    }
}

@Composable
fun PessoaHanking(nome: String, colocacao: String) {
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .border(0.5.dp, Color.Black)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(5.dp)
        ) {
            Text(text = "$nome")
        }
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            Text(
                text = "$colocacao º Lugar",
                fontSize = 16.sp,
                color = colorResource(id = R.color.verde)
            )
        }
    }
}

@Composable
fun MenuNavegacao() {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 45.dp)

    ){
        Image(
            painter = painterResource(id = R.drawable.home),
            contentDescription = "Icone Home",
            modifier = Modifier
                .width(72.dp)
                .height(30.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.calculadora),
            contentDescription = "Icone Calculadora",
            modifier = Modifier
                .width(72.dp)
                .height(30.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.desafios),
            contentDescription = "icone Desafios",
            modifier = Modifier
                .width(72.dp)
                .height(30.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.hanking),
            contentDescription = "Icone Hanking",
            modifier = Modifier
                .width(72.dp)
                .height(30.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "Icone Perfil",
            modifier = Modifier
                .width(72.dp)
                .height(30.dp)
        )


    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview() {
    HomeScreen()
}


