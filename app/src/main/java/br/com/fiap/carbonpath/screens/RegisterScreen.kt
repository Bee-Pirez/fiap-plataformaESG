package br.com.fiap.carbonpath.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.carbonpath.ui.components.Input
import br.com.fiap.carbonpath.ui.components.InputType
import br.com.fiap.carbonpath.ui.components.Button

@Composable
fun RegisterScreen() {
    val nome by remember {
        mutableStateOf("")
    }
    val email by remember {
        mutableStateOf("")
    }
    val cnpj by remember {
        mutableStateOf("")
    }
    val senha by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(12.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Text(
                text = "Carbon Path",
                fontSize = 28.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
            )
            Text(
                text = "slogan",
                fontSize = 16.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(bottom = 92.dp)
            )
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Crie sua conta",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 24.dp)
                )
                Input(
                    value = nome,
                    inputType = InputType.Text,
                    placeholder = "Nome"
                )
                Spacer(modifier = Modifier.height(16.dp))
                Input(
                    value = email,
                    inputType = InputType.Email,
                    placeholder = "E-mail"
                )
                Spacer(modifier = Modifier.height(16.dp))
                Input(
                    value = cnpj,
                    inputType = InputType.Text,
                    placeholder = "CNPJ"
                )
                Spacer(modifier = Modifier.height(16.dp))
                Input(
                    value = senha,
                    inputType = InputType.Password,
                    placeholder = "Senha"
                )
                Button(
                    modifier = Modifier.padding(top = 24.dp),
                    text = "Criar e acessar",
                    onClick = {},
                    hasBackground = true
                )
            }
            Spacer(modifier = Modifier.height(72.dp))
            Button(
                text = "Voltar para o login",
                onClick = {},
                border = true
            )
        }
    }
}

@Preview
@Composable
fun RegisterScreenPreview() {
    RegisterScreen()
}

