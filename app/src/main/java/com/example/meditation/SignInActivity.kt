package com.example.meditation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class SignInActivity : AppCompatActivity() {
    lateinit var mail:EditText
    lateinit var pass:EditText

    val pattern = ("[a-z0-9]{1,100}"+"@"+"[a-z0-9]{1,6}"+"\\."+"[a-z]{1,3}")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        mail=findViewById(R.id.mailtext)
        pass = findViewById(R.id.textpass)

    }
    fun EmVal(text:String): Boolean
    {
        return Pattern.compile(pattern).matcher(text).matches()
    }
    fun next(view: View){
        if(mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty())
        {
            if(EmVal(mail.text.toString()))
            {
                val intent = Intent(this@SignInActivity, ContentActivity::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                Toast.makeText(this, "Поле Email заполнено неверно", Toast.LENGTH_SHORT).show()
            }
        }else
        {
            Toast.makeText(this, "Заполните поля", Toast.LENGTH_SHORT).show()
        }

    }
}