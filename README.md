# SpeedMeter-Compose
Speed Meter for android JetPack Compose
<a href="">
<img src="https://github.com/farimarwat/SpeedMeter-Compose/blob/master/speedmeter.gif" width="30%" height="30%"/>
</a>

### Implementation
```
    implementation "io.github.farimarwat:speedmeter-compose:1.0"

```

### Usage
```
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
```

**Sample Project is included. Just cone it**
