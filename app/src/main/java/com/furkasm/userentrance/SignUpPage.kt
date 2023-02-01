package com.furkasm.userentrance

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.DrawableCompat.inflate
import android.view.View.inflate
import android.widget.Button
import com.furkasm.userentrance.databinding.ActivityMainBinding.inflate
import com.furkasm.userentrance.databinding.ActivitySignUpPageBinding
import com.furkasm.userentrance.databinding.ActivitySignUpPageBinding.inflate

class SignUpPage : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener{
            val intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
        }
    }



}