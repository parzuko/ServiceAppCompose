package com.jivansh.serviceapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.jivansh.serviceapp.ui.ServiceAppTheme

@Composable
fun AppBar(){
    TopAppBar(
        backgroundColor = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier.padding(8.dp).fillMaxWidth().fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = {}) {
                Icon(asset = Icons.Filled.Menu, modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Preview
@Composable
fun PreviewAppBar(){
    ServiceAppTheme {
        AppBar()
    }
}