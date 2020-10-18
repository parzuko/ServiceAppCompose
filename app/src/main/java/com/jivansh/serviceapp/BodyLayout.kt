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
                    .padding(10.dp)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .wrapContentHeight(),
    ) {
        Text(text = "Hi Jivansh", style = MaterialTheme.typography.h2, color = MaterialTheme.colors.background)
        Text(text = "G o o d  M o r n i n g !", style = MaterialTheme.typography.h6, color = MaterialTheme.colors.background)
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "2 new shipments are available", style = MaterialTheme.typography.body1, color = MaterialTheme.colors.secondary)
        InfoCard()
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewBodyLayout(){
    ServiceAppTheme {
        BodyLayout()
    }
}