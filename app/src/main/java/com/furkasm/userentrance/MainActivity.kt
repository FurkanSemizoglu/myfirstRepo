package com.furkasm.userentrance

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.furkasm.userentrance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val loginButton = findViewById<Button>(R.id.saveButton)

      // val button = findViewById<Button>(R.id.signupView)

        loginButton.setOnClickListener{
            val intent = Intent(this,SignUpPage ::class.java)

            startActivity(intent)
        }
    }


    fun signupClicked(view : View){
        val intent = Intent(this,SignUpPage :: class.java)

        startActivity(intent)
    }
    /*
    fun buttonClicked(view: View){
        if (textEmail.text.text)
    }
    */

}