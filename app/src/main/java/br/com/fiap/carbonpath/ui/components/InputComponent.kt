package br.com.fiap.carbonpath.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardCapitalization


enum class InputType {
    Text,
    Email,
    Password
}


@Composable
fun Input(
    value: String,
    inputType: InputType = InputType.Text,
    placeholder: String? = null
)
{

    val textFieldValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = textFieldValue.value,
        onValueChange = { novoValor ->
            textFieldValue.value = novoValor
        },
        modifier = Modifier
            .fillMaxWidth(),
        placeholder = {
            Text(text = placeholder ?: "Placeholder")
        },
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Black,
            focusedBorderColor = Color.Black,
        ),
        shape = RoundedCornerShape(6.dp),
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Words,
            keyboardType = when (inputType) {
            InputType.Email -> KeyboardType.Email
            InputType.Password -> KeyboardType.Password
            else -> KeyboardType.Text
        })
    )
}


@Preview
@Composable
fun PreviewEmailInput() {
    Input(
        value = "",
        inputType = InputType.Email,
        placeholder = "Email"
    )
}

@Preview
@Composable
fun PreviewPasswordInput() {
    Input(
        value = "",
        inputType = InputType.Password,
        placeholder = "Password"
    )
}



