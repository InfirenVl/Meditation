package com.example.meditation

data class Elem(val imageId:Int, val title: String)
class ElemList
    {
        val list = arrayListOf(
    Elem(R.drawable.elemimg2, "Спокойным"),
    Elem(R.drawable.elemimg3, "Расслабленным"),
    Elem(R.drawable.elemimg1, "Задумчивым"),
    Elem(R.drawable.elemimg2, "Взволнованным"))
    }
