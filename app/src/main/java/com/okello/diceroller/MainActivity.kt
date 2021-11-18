package com.okello.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var randomInt=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonToast: Button = findViewById(R.id.button_toast)
        buttonToast.setOnClickListener{toastMyButton()}

        val buttonRoll: Button = findViewById(R.id.button_roll)
        buttonRoll.setOnClickListener{rollDice()}

        val buttonRed : Button = findViewById(R.id.button_count)
        buttonRed.setOnClickListener{reduceDiceroll()}
    }
    private fun toastMyButton(){
        Toast.makeText(this,"00h My!! My first application", Toast.LENGTH_SHORT).show();
    }
    private fun rollDice(){
        val randomInt = (1..7).random()
        val textResult: TextView = findViewById(R.id.textResult)
        textResult.text = randomInt.toString()
    }
    private fun reduceDiceroll(){
        var newNumber = ++randomInt
        val textResult: TextView = findViewById(R.id.textResult)
        textResult.text = newNumber.toString()
    }
}