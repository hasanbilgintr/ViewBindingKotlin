package com.hasanbilgin.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.hasanbilgin.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //javadaki gibi textview tanıtma
    //private lateinit var textView: TextView

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            
      
        //textView=findViewById(R.id.helloTextview)  //aynı
        //textView = findViewById<TextView>(R.id.helloTextview)


    }

    fun tikla(view: View) {
        println("tiklandı")
        //textView.text = "tıklandı :D"
        binding.helloTextview.text = "tıklandı :D"

    }
}