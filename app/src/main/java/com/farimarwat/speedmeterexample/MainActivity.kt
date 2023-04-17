package com.farimarwat.speedmeterexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.farimarwat.speedmeter.SpeedMeter
import com.farimarwat.speedmeterexample.ui.theme.SpeedMeterExampleTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpeedMeterExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SpeedMeterTest()
                }
            }
        }
    }
}
@Composable
fun SpeedMeterTest(){
    Column {
        var progress by remember {
            mutableStateOf(30f)
        }
        SpeedMeter(
            modifier = Modifier.size(400.dp, 400.dp),
            backgroundColor = Color.Black,
            progressWidth = 50f,
            progress = progress ,
            needleColors = listOf(Color.Black,Color.White),
            needleKnobColors = listOf(Color.Black,Color.Gray),
            needleKnobSize = 20f,
            progressColors = listOf(Color.Red, Color.Yellow),
            labelColor = Color.White,
            unitText = "MB"
        )
        Button(onClick = {

            progress = Random.nextInt(100).toFloat()

        }) {
            Text(text = "Progress")
        }
    }
}



@Preview
@Composable
fun SpeedMeterPreview(){
    SpeedMeterTest()
}

