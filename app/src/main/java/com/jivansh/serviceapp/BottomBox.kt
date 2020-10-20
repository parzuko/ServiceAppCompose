package com.jivansh.serviceapp

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.jivansh.serviceapp.ui.ServiceAppTheme
import com.jivansh.serviceapp.ui.shade

@Composable
fun BottomBox(){
    ScrollableColumn() {
        PersonInfo(workerName = "Marcus Rashford",facility = "Goals.Goals.Goals", id = R.drawable.human, time = "6:00 PM")
    }
}

@Composable
private fun PersonInfo(workerName: String, facility: String, id: Int, time: String){
    Card(
            modifier = Modifier.padding(8.dp).fillMaxWidth().wrapContentHeight(),
            backgroundColor = Color.White
    ) {
        Column() {
            Spacer(modifier = Modifier.padding(8.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                Row() {
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
                            asset = imageResource(id = id),

                            )
                    Spacer(modifier = Modifier.padding(15.dp))
                    Column {
                        Text(text = "$workerName", style = MaterialTheme.typography.subtitle1, color = MaterialTheme.colors.background)
                        Text(text = "$facility", style = MaterialTheme.typography.body2, color = MaterialTheme.colors.secondary)
                        Spacer(modifier = Modifier.padding(10.dp))

                    }
                }
                Text(modifier = Modifier.padding(horizontal = 8.dp),text = "$time", style = MaterialTheme.typography.subtitle2, color = MaterialTheme.colors.background)




            }
        }

    }
}

@Preview
@Composable
fun PreviewBottomBox(){
    ServiceAppTheme {
        BottomBox()
    }
}
