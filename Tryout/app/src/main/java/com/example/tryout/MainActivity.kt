package com.example.tryout


import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countText: TextView = findViewById(R.id.editTextNumberSigned)
        countText.text = "0"
        var count = 0
        val star : ImageView = findViewById(R.id.imageView6)
        star.visibility = INVISIBLE
        val addButton: Button = findViewById(R.id.button)
        addButton.setOnClickListener()
        {
            val toast = Toast.makeText(this, "Addition completed!",Toast.LENGTH_SHORT)
            toast.show()
            count += 1
            if (count == 5)
            {
                star.visibility = VISIBLE
                //star.animation = startAnimation()
            }
            else
                star.visibility = INVISIBLE
            countText.text = count.toString()
        }
        val subButton: Button = findViewById(R.id.button2)
        subButton.setOnClickListener()
        {
            val toast = Toast.makeText(this, "Subtract completed!",Toast.LENGTH_SHORT)
            toast.show()
            count -= 1
            if (count == 5)
                star.visibility = VISIBLE
            else
                star.visibility = INVISIBLE
            countText.text = count.toString()
        }

    }
}