package com.example.jamchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.jamchallenge.data.Classify
import com.example.jamchallenge.data.Dog

class DogFriendViewModel:ViewModel() {

    val classifies = mutableListOf(
        Classify("Small").apply { selected = true },
        Classify("Big"),
        Classify("Black"),
        Classify("White"),
        Classify("Others"),
        Classify("Others"),
    )

    val dogs = mutableListOf(
        Dog("p1", "puppy1", R.mipmap.puppy1),
        Dog("p2", "puppy2", R.mipmap.puppy2),
        Dog("p3", "puppy3", R.mipmap.puppy3),
        Dog("p4", "puppy4", R.mipmap.puppy4),
    )

    var filterKeywords:String by mutableStateOf("")

}