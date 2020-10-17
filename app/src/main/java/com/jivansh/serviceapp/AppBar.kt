package com.jivansh.serviceapp

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.jivansh.serviceapp.ui.ServiceAppTheme

@Composable
fun AppBar(){
    Surface(color = MaterialTheme.colors.background) {
        TopAppBar(
            backgroundColor = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxWidth().height(90.dp),
        ) {
            Row(
                modifier = Modifier.padding(8.dp).fillMaxWidth().fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = {}){
                    Icon(Icons.Filled.Menu.copy(defaultHeight = 40.dp, defaultWidth = 40.dp))
                }
                Image(
                    modifier = Modifier
                        .width(55.dp)
                        .height(55.dp)
                        .border(
                            border = BorderStroke(1.dp, color = Color.White),
                            shape = CircleShape
                        ).clip(shape = CircleShape)
                        .background(color = Color.White)
                        .padding(8.dp),
                    asset = imageResource(id = R.drawable.man),

                    )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppBar(){
    ServiceAppTheme {
        AppBar()
    }
}