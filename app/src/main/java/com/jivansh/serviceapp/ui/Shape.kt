package com.jivansh.serviceapp.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.drawLayer
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.google.android.material.shape.CornerSize
import com.google.android.material.shape.TriangleEdgeTreatment
import com.jivansh.serviceapp.R

val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
)

val ServiceAppShapes = Shapes(
        small = RoundedCornerShape(topLeft = 40.dp, topRight = 40.dp)
)


val TriangleShape = GenericShape { size ->
    moveTo(size.width / 2f, 0f)
    lineTo(size.width, size.height)
    lineTo(0f, size.height)
}


@Composable
private fun DrawUpsideDownTriangle(){
    Column {
        Spacer(modifier = Modifier.padding(3.dp))
        Image(
                modifier = Modifier
                        .width(10.dp)
                        .height(10.dp)
                        .drawLayer(
                                rotationZ = -180f
                        )
                        .border(
                                border = BorderStroke(1.dp, color = MaterialTheme.colors.error),
                                shape = TriangleShape
                        ).clip(shape = TriangleShape)
                        .background(color = MaterialTheme.colors.error)
                        .padding(8.dp),
                asset = imageResource(id = R.drawable.man),

                )
    }

}
@Composable
private fun DrawTriangle(){
    Image(
            modifier = Modifier
                    .width(10.dp)
                    .height(10.dp)
                    .border(
                            border = BorderStroke(1.dp, color = MaterialTheme.colors.error),
                            shape = TriangleShape
                    ).clip(shape = TriangleShape)
                    .background(color = MaterialTheme.colors.error)
                    .padding(8.dp),
            asset = imageResource(id = R.drawable.man),

            )
}


@Composable
fun StarShape(){
    Box (alignment = Alignment.Center){
        DrawTriangle()
        DrawUpsideDownTriangle()
    }
}