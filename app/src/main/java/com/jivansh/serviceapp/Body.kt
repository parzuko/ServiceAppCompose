package com.jivansh.serviceapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.jivansh.serviceapp.ui.ServiceAppTheme


@Composable
fun Body(){
    Surface(color = MaterialTheme.colors.background) {
        Box() {
            Box(modifier = Modifier.fillMaxSize())
            Box(modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxHeight(.95f)
                    .fillMaxWidth()
                    .border(
                            border = BorderStroke(5.dp, color = MaterialTheme.colors.primary),
                            shape = MaterialTheme.shapes.small
                    ).clip(shape = MaterialTheme.shapes.small)
                    .background(color =  MaterialTheme.colors.primary)
                    .padding(8.dp),
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBody(){
    ServiceAppTheme {
        Body()
    }
}

