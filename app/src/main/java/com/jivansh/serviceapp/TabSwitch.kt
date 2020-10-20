package com.jivansh.serviceapp

import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.jivansh.serviceapp.ui.ServiceAppTheme

@Composable
fun TabSwitch(){
    Card(
            modifier = Modifier.fillMaxWidth().height(58.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            backgroundColor = MaterialTheme.colors.surface
    ){
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
            Card(modifier = Modifier.height(58.dp).fillMaxWidth(.5f).padding(8.dp), backgroundColor = Color.White,shape = RoundedCornerShape(corner = CornerSize(15.dp))) {
                Text(textAlign = TextAlign.Center, modifier =  Modifier.padding(vertical = 8.dp), text = "Upcoming", style = MaterialTheme.typography.subtitle1, color = MaterialTheme.colors.background)
            }
            Text(textAlign = TextAlign.Center, modifier =  Modifier.padding(vertical = 8.dp, horizontal = 30.dp), text = "History", style = MaterialTheme.typography.subtitle1, color = MaterialTheme.colors.background)
        }
    }
}

@Preview
@Composable
fun PreviewTabSwitch(){
    ServiceAppTheme {
        TabSwitch()
    }
}