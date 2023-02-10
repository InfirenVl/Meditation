package com.example.meditation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        val recviewvert: RecyclerView =findViewById((R.id.rec_elem))
        recviewvert.adapter=ElemAdapter(this, ElemList().list)
    }

}