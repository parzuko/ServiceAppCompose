package com.jivansh.serviceapp

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.jivansh.serviceapp.ui.ServiceAppTheme
import com.jivansh.serviceapp.ui.StarShape
import com.jivansh.serviceapp.ui.TriangleShape
import com.jivansh.serviceapp.ui.shade

@Composable
fun InfoCard(){
    Card(
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            modifier = Modifier.padding(8.dp).fillMaxWidth().wrapContentHeight(),
            backgroundColor = Color.White
        ) {
            Column() {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Icon(asset = Icons.Filled.Info.copy(defaultHeight = 40.dp, defaultWidth = 40.dp), tint = MaterialTheme.colors.secondary)
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.padding(15.dp))
                    Image(
                            modifier = Modifier
                                    .width(55.dp)
                                    .height(55.dp)
                                    .border(
                                            border = BorderStroke(4.dp, color = shade),
                                            shape = CircleShape
                                    ).clip(shape = CircleShape)
                                    .background(color = shade)
                                    .padding(8.dp),
                            asset = imageResource(id = R.drawable.man),

                            )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Column {
                        Text(text = "Mason Greenwood", style = MaterialTheme.typography.subtitle1, color = MaterialTheme.colors.background)
                        StarRow()
                        Text(text = "Business place business city", style = MaterialTheme.typography.body2, color = MaterialTheme.colors.secondary)
                        Text(text = "Weight: 2KG   ", style = MaterialTheme.typography.body2, color = MaterialTheme.colors.secondary)

                        Spacer(modifier = Modifier.padding(8.dp))
                        Row {
                            OutlinedButton(
                                    onClick = {},
                                    backgroundColor = MaterialTheme.colors.primaryVariant,
                                    shape = CircleShape,
                                    contentColor = MaterialTheme.colors.background,
                                    border = BorderStroke(width = 1.dp, color = MaterialTheme.colors.primaryVariant)
                            ) {
                                Text(text = "10:30 pm", style = MaterialTheme.typography.button, color = MaterialTheme.colors.background)
                            }
                            Spacer(modifier = Modifier.padding(5.dp))
                            OutlinedButton(
                                    onClick = {},
                                    backgroundColor = MaterialTheme.colors.primaryVariant,
                                    shape = CircleShape,
                                    contentColor = MaterialTheme.colors.background,
                                    border = BorderStroke(width = 1.dp, color = MaterialTheme.colors.primaryVariant)
                            ) {
                                Text(text = "7:00 am", style = MaterialTheme.typography.button, color = MaterialTheme.colors.background)

                            }
                        }


                    }

                }
            }

    }

}

@Composable
private fun StarRow(){
    Row {
        StarShape()
        Spacer(modifier = Modifier.padding(2.dp))
        StarShape()
        Spacer(modifier = Modifier.padding(2.dp))
        StarShape()
        Spacer(modifier = Modifier.padding(2.dp))
        StarShape()
        Spacer(modifier = Modifier.padding(2.dp))
        StarShape()
    }
}

@Preview
@Composable
fun PreviewInfoCard(){
    ServiceAppTheme {
        InfoCard()
    }
}