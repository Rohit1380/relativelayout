package com.rare.relativelayout

import android.net.eap.EapSessionConfig.EapTtlsConfig
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class RegisterActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etphone: EditText
    lateinit var etpassword: EditText
    lateinit var etconfirm: EditText
    lateinit var rbtn: RadioButton
    lateinit var rbtn1: RadioButton
    lateinit var rbtn2: RadioButton
    lateinit var etothers: EditText
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        etName = findViewById(R.id.etName)
        etphone = findViewById(R.id.etphone)
        etpassword = findViewById(R.id.etpassword)
        etconfirm = findViewById(R.id.etconfirm)
        rbtn = findViewById(R.id.rbtn)
        rbtn1 = findViewById(R.id.rbtn1)
        rbtn2 = findViewById(R.id.rbtn2)
        etothers = findViewById(R.id.etothers)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener{
            if(etName.text.isEmpty()){
                etName.error="Enter your name"
            }else if(etphone.text.isEmpty()){
                etphone.error="Enter phone number"
            }else if (etpassword.text.isEmpty()){
                etpassword.error="enter password"
            }else if(etconfirm.text.isEmpty()){
                etconfirm.error="Confirm password"
            }
        }
        rbtn2.setOnCheckedChangeListener { buttonview, ischecked ->
            if (ischecked) {
                etothers.visibility = View.VISIBLE
            } else {
                etothers.visibility = View.GONE
            }
        }
    }
}