package edu.uw.ischool.nalogman.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var pushButton: Button
    private var pushCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pushButton = findViewById(R.id.pushButton)

        // Set initial text
        updateButtonText()

        // Set click listener for the button
        pushButton.setOnClickListener {
            pushCount++
            updateButtonText()
        }
    }

    private fun updateButtonText() {
        // Update button text with the push count
        pushButton.text = "You have pushed me $pushCount time" + if (pushCount == 1) "" else "s"
    }
}