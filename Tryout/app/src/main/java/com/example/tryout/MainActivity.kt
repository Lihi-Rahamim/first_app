package com.example.tryout


import android.content.Context
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

        val sp = getSharedPreferences(
            "Current_status",
            Context.MODE_PRIVATE
        ) //YourFileName= Any file name you give it
        val countText: TextView = findViewById(R.id.editTextNumberSigned)
        val current_count = sp.getString("count", "0")
        countText.text = current_count
        var count : Int = current_count?.toInt() ?: 0

        val star : ImageView = findViewById(R.id.imageView6)
        if(count != 5)
            star.visibility = INVISIBLE
        else
            star.visibility = VISIBLE
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
            val editor = sp.edit()
            editor.putString(
                "count",
                count.toString()
            )
            editor.apply()
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
            val editor = sp.edit()
            editor.putString(
                "count",
                count.toString()
            )
            editor.apply()
        }
        val resetButton: Button = findViewById(R.id.button3)
        resetButton.setOnClickListener()
        {
            val toast = Toast.makeText(this, "Value Reset complete!",Toast.LENGTH_SHORT)
            toast.show()
            count = 0
            countText.text = count.toString()
            star.visibility = INVISIBLE
            val editor = sp.edit()
            editor.putString(
                "count",
                count.toString()
            )
            editor.apply()
        }








    }
}