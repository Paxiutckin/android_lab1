package com.example.android_cs2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_cs2.ui.theme.Android_cs2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
        NewText()
                }
            }
        }

@Composable
// создаем черный фон
fun NewText() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){

    }




    Column(
        modifier = Modifier
        .verticalScroll(rememberScrollState())
    ){
// создаем "шапку экрана"
        Image(
            painter = painterResource(id = R.drawable.shapka),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        )


// помещаем описание
        Row(
            modifier = Modifier
                .padding(horizontal = 5.dp, vertical = 45.dp)
        ) {

            Text(
                text = "Компьютерная игра в жанре многопользовательского тактического шутера от первого лица, разрабатываемая компанией Valve. Игроки делятся на две команды: контртеррористы и террористы. Каждый игровой режим имеет разные цели и разделен на несколько раундов",
                fontSize = 16.sp,
                color = Color.Yellow
            )
        }
            // создаем галерею ,которую можно скролить
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth()
                .height(150.dp)
                .padding(3.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,




        ){
            Image(painter = painterResource(id = R.drawable.promo1), contentDescription = null, contentScale = ContentScale.Fit,modifier = Modifier.clip(RoundedCornerShape(10.dp)))
            Image(painter = painterResource(id = R.drawable.promo2), contentDescription = null, contentScale = ContentScale.Fit,modifier = Modifier.clip(RoundedCornerShape(10.dp)))
            Image(painter = painterResource(id = R.drawable.promo3), contentDescription = null, contentScale = ContentScale.Fit,modifier = Modifier.clip(RoundedCornerShape(10.dp)))
            Image(painter = painterResource(id = R.drawable.promo4), contentDescription = null, contentScale = ContentScale.Fit,modifier = Modifier.clip(RoundedCornerShape(10.dp)))
            Image(painter = painterResource(id = R.drawable.promo5), contentDescription = null, contentScale = ContentScale.Fit,modifier = Modifier.clip(RoundedCornerShape(10.dp)))

        }
            // создаем кнопку Download,  кнопка имеет ховер эффект
        Row(
            modifier = Modifier
                .padding(horizontal = 30.dp, vertical = 23.dp)
                .height(50.dp)
                .width(380.dp)
                .clip(shape = RoundedCornerShape(size = 12.dp))
                .clickable { }
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,


//незавершенная наработка(код)
        ) {
            Text(
                text = "Download",
                fontSize = 25.sp,
            )
        }
        Column(
             modifier = Modifier
                 .padding(horizontal = 30.dp, vertical = 25.dp)
        ) {
            Text(text = "Review & Ratings", fontSize = 25.sp, fontWeight = FontWeight.Bold,color= Color.Yellow)

        }
    }
        // создаем значок , со значком есть проблемы,  он не в Column , что делает его статичным во время скроллинга
    Card(
        modifier = Modifier
            .padding(horizontal = 25.dp, vertical = 180.dp)
            .size(80.dp),
        shape = RoundedCornerShape(15.dp)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.znacok),
            contentDescription = null,
            contentScale = ContentScale.Crop,

            )
    }
}









