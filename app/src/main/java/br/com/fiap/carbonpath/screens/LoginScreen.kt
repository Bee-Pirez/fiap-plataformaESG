package br.com.fiap.carbonpath.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun LoginScreen() {
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
                .padding(top = 28.dp)
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
                    text = "Acesse sua conta",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 24.dp),
                )
                Input(
                    value = "",
                    inputType = InputType.Email,
                    placeholder = "E-mail"
                )
                Spacer(modifier = Modifier.height(16.dp))
                Input(
                    value = "",
                    inputType = InputType.Password,
                    placeholder = "PSenha",
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Text(
                        text = "Esqueci minha senha",
                        color = Color.Black
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                    ) {
                        Checkbox(
                            checked = false,
                            onCheckedChange = {},
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color.White,
                                uncheckedColor = Color(0xFF08DE00)
                            )
                        )
                        Text(
                            text = "Lembre-me",
                            color = Color.Black
                        )
                    }
                }


                Button(
                    modifier = Modifier.padding(top = 24.dp),
                    text = "Acessar",
                    onClick = {},
                    hasBackground = true,
                )
            }
            Spacer(modifier = Modifier.height(96.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Ainda não tem acesso?",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Normal,
                )
                Spacer(modifier = Modifier.height(12.dp))
                Button(
                    text = "Criar conta",
                    onClick = {},
                    border = true,
                )
            }

        }


    }
}


@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}

