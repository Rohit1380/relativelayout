package com.rare.relativelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var etemail:EditText
    lateinit var etpassword:EditText
    lateinit var btnLogin:Button
    lateinit var tvregister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etemail=findViewById(R.id.etemail)
etpassword=findViewById(R.id.etpassword)
        btnLogin=findViewById(R.id.btnlogin)
        tvregister=findViewById(R.id.tvregister)

        btnLogin.setOnClickListener{
            if(etemail.text.isEmpty()) {
                etemail.error = "Enter your email"
            }else if(etpassword.text.isEmpty()){
                etpassword.error="Enter your password"
            }else if(etpassword.text.toString().length<8)
            {
                etpassword.error="Password should be of atleast 8 digits"

            }else{
                var email=etemail.text
                var password=etpassword.text
//            system.out.println("email $email password $password")

        }
        }
            tvregister.setOnClickListener {
                var intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
    }
}