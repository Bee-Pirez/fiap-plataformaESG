package br.com.fiap.carbonpath.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.Color


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
) {
    OutlinedTextField(
        value = value,
        onValueChange = {},
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
        keyboardOptions = KeyboardOptions(keyboardType = when (inputType) {
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



