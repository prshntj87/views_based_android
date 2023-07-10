package com.example.radio_button_checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val rgMeat = findViewById<RadioGroup>(R.id.rgMeat)
        val rbBeef = findViewById<RadioButton>(R.id.rbBeef)
        val rbChicken = findViewById<RadioButton>(R.id.rbChicken)
        val rbPork = findViewById<RadioButton>(R.id.rbPork)
        val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
        val cbOnions = findViewById<CheckBox>(R.id.cbOnions)
        val cbSalad = findViewById<CheckBox>(R.id.cbSalad)
        val tvUserChoice = findViewById<TextView>(R.id.tvUserChoice)
        btnOrder.setOnClickListener {
            //val meat = if (rgMeat.checkedRadioButtonId == R.id.rbBeef) "Beef" else if (rgMeat.checkedRadioButtonId == R.id.rbChicken) "Chicken" else "Pork"

            val meat = findViewById<Button>(rgMeat.checkedRadioButtonId).text

            tvUserChoice.text = "User order choices are: " + "$meat" + (if (cbCheese.isChecked) "\nCheese" else "") + (if (cbOnions.isChecked) "\nOnions" else "") + (if (cbSalad.isChecked) "\nSalad" else "")
        }

    }
}
