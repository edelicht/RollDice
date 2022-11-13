package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btRoll.text = "Let's Roll"
        binding.btRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        when (Random.nextInt(6) + 1) {
            1 -> binding.ivDice.setImageResource(R.drawable.dice_1)
            2 -> binding.ivDice.setImageResource(R.drawable.dice_2)
            3 -> binding.ivDice.setImageResource(R.drawable.dice_3)
            4 -> binding.ivDice.setImageResource(R.drawable.dice_4)
            5 -> binding.ivDice.setImageResource(R.drawable.dice_5)
            6 -> binding.ivDice.setImageResource(R.drawable.dice_6)
        }

    }
}