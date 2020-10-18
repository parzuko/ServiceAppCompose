package com.jivansh.serviceapp

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.HorizontalAlignmentLine
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.jivansh.serviceapp.ui.ServiceAppTheme
import org.intellij.lang.annotations.JdkConstants

@Composable
fun BodyLayout(){
    Surface(color = MaterialTheme.colors.background) {
        Box {
            Body()
            BodyContent()
        }
    }
}

@Composable
private fun BodyContent(){
    Column(
            modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .wrapContentHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Hi Jivansh", color = MaterialTheme.colors.error,style = MaterialTheme.typography.h1)
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewBodyLayout(){
    ServiceAppTheme {
        BodyLayout()
    }
}