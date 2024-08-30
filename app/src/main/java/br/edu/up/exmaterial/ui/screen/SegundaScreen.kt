package br.edu.up.exmaterial.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.up.exmaterial.ui.theme.Purple80

@Composable
fun SegundaScreen(titulo: String, modifier: Modifier = Modifier) {
    LayoutLinha()
}

@Composable
fun Layout(){
    Column (modifier = Modifier
        .fillMaxSize()){
        Row (modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color.Cyan)){
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Purple80))
        }

        Row (modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color.DarkGray)){
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.White))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue))
        }
    }
}

@Composable
fun LayoutLinha(){
    Column(modifier = Modifier
        .fillMaxSize()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color.Red)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color.Yellow)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color.Green)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color.Blue)
            )
    }
}

@Preview(
    device = Devices.PIXEL
)
@Composable
fun LayoutFinal(){
    Column{
        Row (modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color.Cyan)){
            Box(
                modifier = Modifier
                    //.width(100.dp)
                    //.fillMaxWidth()
                    .weight(3f)
                    .fillMaxHeight()
                    .background(Color.Red)
            )
            Box(
                modifier = Modifier
                    //.width(100.dp)
                    //.fillMaxWidth()
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }
        Row (modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color.Cyan)){
            Box(
                modifier = Modifier
                    //.width(100.dp)
                    //.fillMaxWidth()
                    .weight(2f)
                    .fillMaxHeight()
                    .background(Color.Red)
            )
            Box(
                modifier = Modifier
                    //.width(100.dp)
                    //.fillMaxWidth()
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue)
            )
            Box(
                modifier = Modifier
                    //.width(100.dp)
                    //.fillMaxWidth()
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
            )
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Blue)
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Blue)
        )
    }
}