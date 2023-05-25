package com.example.fibonnacciapp

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.viewbinding.ViewBinding
import com.example.fibonnacciapp.ui.theme.FibonnacciAppTheme

class MainActivity : ComponentActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContent {
            FibonnacciAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

fun displayFibonacciNumber(){
    var numbers = listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34 )

    binding.rvNames.layoutManager=LinearLayoutManager(this)
    val namesAdapter=RecyclerViewAdapter (numbers)
    binding.rvNames.adapter=namesAdapter
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FibonnacciAppTheme {
        Greeting("Android")
    }
}