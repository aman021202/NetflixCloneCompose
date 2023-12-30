package com.example.netflixclonecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netflixclonecompose.ui.theme.NetflixCloneComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier= Modifier
                .fillMaxHeight()
                .background(Color.Black)
                .verticalScroll(rememberScrollState())) {
                TopAppSection()
                NetflixContentChooser()
                FeaturedMovieSection()
                AddMovie("Watch it Again")
                AddMovie("Thriller")
                AddMovie("New")
                AddMovie("Action")
                AddMovie("Drama")
                AddMovie("Watch it Again")
                AddMovie("Thriller")
                AddMovie("New")
                AddMovie("Action")
                AddMovie("Drama")


            }


        }
    }
    @Composable
    //@Preview(showBackground = true)
    fun TopAppSection(){
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(top = 6.dp),
            horizontalArrangement=Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.netflix_icon), contentDescription = "icon",modifier=Modifier.size(60.dp))
            Row {
                Image(painter = painterResource(id =R.drawable.ic_search ), contentDescription = "search",modifier=Modifier.padding(end=12.dp))
                Image(painter = painterResource(id = R.drawable.ic_profile), contentDescription = "profile",modifier=Modifier.padding(end=6.dp))


            }

        }
    }
    @Composable
   // @Preview(showBackground=true)
    fun NetflixContentChooser(){
        Row (modifier= Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(horizontal = 30.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically)
        {
            Text(text = "TV Shows",color=Color.LightGray, fontSize = 20.sp)
            Text(text = "Movies",color=Color.LightGray, fontSize = 20.sp)
            Row {
                Text(text = "Categories",color=Color.LightGray, fontSize = 20.sp)
                Image(painter = painterResource(id = R.drawable.ic_drop), contentDescription ="drop image" )

            }


        }

    }
    @Composable
   // @Preview(showBackground = true)
    fun FeaturedMovieSection() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.image_feature), contentDescription = "",
                modifier = Modifier
                    .size(250.dp)
                    .padding(horizontal = 20.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp, start = 70.dp, end = 70.dp),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Text(text = "Adventure", color = Color.White)
                Text(text = "Thriller", color = Color.White)
                Text(text = "Drama", color = Color.White)
                Text(text = "Action", color = Color.White)


            }
            Row (modifier= Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, start = 30.dp, end = 30.dp),
                verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.SpaceBetween ){
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_add),
                        contentDescription = " "
                    )
                    Text(text = "My List",color=Color.White, fontSize = 10.sp)


                }
                Button(onClick = {  },
                colors=ButtonDefaults.buttonColors(Color.White),
                    shape = RoundedCornerShape(4.dp)) {
                        Text("Play",color=Color.Black, fontSize = 18.sp)
                }
                Image(painter = painterResource(id = R.drawable.ic_info), contentDescription = "")
            }


        }

    }
    @Composable
   // @Preview(showBackground = true)
    fun AddMovie(movieType:String){
        val listOfMovies= mutableListOf<MovieItemModel>()
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        listOfMovies.add(MovieItemModel(R.drawable.image_movie1))
        Column (modifier= Modifier
            .fillMaxWidth()
            .background(Color.Black)){
            Text(
                text = movieType,
                color = Color.LightGray,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier=Modifier.padding(top=20.dp,start=12.dp)
            )
            LazyRow(
                modifier=Modifier.padding(top=1.dp)
            ){
                itemsIndexed(listOfMovies){
                    index, item ->
                    MovieItemModelUi(imageRes = item.image)

                }
            }
        }
    }
    @Composable
    //@Preview(showBackground = true)
fun MovieItemModelUi( imageRes:Int){
    Image(painter = painterResource(id =imageRes), contentDescription ="",
        modifier = Modifier
            .height(200.dp)
            .width(100.dp))
}

}
data class MovieItemModel(
        val image:Int
        )

