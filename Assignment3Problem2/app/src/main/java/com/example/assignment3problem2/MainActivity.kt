package com.example.assignment3problem2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogin: MaterialButton
    private lateinit var edtEmail: TextInputEditText
    private lateinit var edtPassword: TextInputEditText
    private lateinit var btnCreateAccount: MaterialButton
    private lateinit var txtForgetPassword: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogin.setOnClickListener {
            Toast.makeText(this, "Sign in", Toast.LENGTH_SHORT)
        }

        btnCreateAccount = findViewById(R.id.btnCreateAccount)
        btnCreateAccount.setOnClickListener {
            Toast.makeText(this, "Create account", Toast.LENGTH_SHORT)
        }

        txtForgetPassword = findViewById(R.id.txtForgetPassword)
        txtForgetPassword.setOnClickListener {
            Toast.makeText(this, "Forget password", Toast.LENGTH_SHORT)
        }
    }


}