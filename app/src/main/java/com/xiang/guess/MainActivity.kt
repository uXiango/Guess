package com.xiang.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val serectNumber = SerectNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","number ${serectNumber.serect}") //顯示產生的亂數方便測試
    }

    fun check(view : View) {
        val n = number.text.toString().toInt()
        println("number : $n")
        Log.d("MainActivity","number: $n")
        val diff = serectNumber.validate(n)
        var message = "Yes, you got it! "
        if (diff < 0 ) {
            message = "Bigger!"
        } else if (diff > 0) {
            message = "Smaller!"
        }
//        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle("Message")
            .setMessage(message)
            .setPositiveButton("OK",null)
            .show()
    }
}