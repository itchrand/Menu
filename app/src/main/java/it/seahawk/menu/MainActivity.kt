package it.seahawk.menu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun printToLogs(view: View) {
        Log.i("MainActivity.kt", "Captain's Log, Stardate 43125.8. We have entered a spectacular binary star system in the Kavis Alpha sector on a most critical mission of astrophysical research.")

        // Find first menu item TextView and print the text to the logs
        val menuItem1 = findViewById<TextView>(R.id.menu_item_1)
        Log.i("MainActivity.kt", "Menu's Log, Text of menu item 1: " + menuItem1.text)

        // Find second menu item TextView and print the text to the logs
        val menuItem2 = findViewById<TextView>(R.id.menu_item_2)
        Log.i("MainActivity.kt", "Menu's Log, Text of menu item 2: " + menuItem2.text)

        // Find third menu item TextView and print the text to the logs
        val menuItem3 = findViewById<TextView>(R.id.menu_item_3)
        Log.i("MainActivity.kt", "Menu's Log, Text of menu item 3: " + menuItem3.text)


    }
}
