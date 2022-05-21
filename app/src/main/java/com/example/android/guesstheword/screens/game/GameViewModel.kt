package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel:ViewModel(){

    init {
        Log.i("on create","Game View Model created");
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("on clear","Game View Model destroyed")
    }
}