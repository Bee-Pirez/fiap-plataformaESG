package br.com.fiap.carbonpath.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding


@Composable
fun Button(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    hasBackground: Boolean = false,
    border: Boolean = false
) {
    val buttonColors = if (hasBackground) {
        ButtonDefaults.buttonColors(Color(0xFF08DE00))
    } else {
        ButtonDefaults.buttonColors(Color.Transparent)
    }

    val textColor = if (border) Color(0xFF08DE00) else Color.White

    Button(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(6.dp),
        colors = buttonColors,
        border = if (border) BorderStroke(1.dp, Color(0xFF08DE00)) else null
    ) {
        Text(text = text, color = textColor)
    }
}


@Preview
@Composable
fun PreviewButtonWithBackground() {
    Button(
        text = "Clique aqui",
        onClick = {},
        hasBackground = true
    )
}

@Preview
@Composable
fun PreviewButtonWithBorder() {
    Button(
        text = "Clique aqui",
        onClick = {},
        border = true
    )
}



