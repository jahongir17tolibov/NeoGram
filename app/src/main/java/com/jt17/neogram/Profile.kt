package com.jt17.neogram

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jt17.neogram.adapters.HomeAdapter
import com.jt17.neogram.models.ItemModel

class Profile : AppCompatActivity() {
    val mylist = arrayListOf<ItemModel>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val recycler = findViewById<RecyclerView>(R.id.recycv)

        recycler.layoutManager = LinearLayoutManager(this)

        mylist.add(ItemModel(R.drawable.person1,"Bitta Qiz", "Salom","12:55",R.drawable.check_white))
        mylist.add(ItemModel(R.drawable.person2,"Bitta Yigit", "Nima qilopsan","12:41",R.drawable.check_white))
        mylist.add(ItemModel(R.drawable.person3,"Bitta Ayol", "Bera kel devona","10:00",R.drawable.check_white))
        mylist.add(ItemModel(R.drawable.person4,"Bitta Kishi", "Tovarimni qachon yetkazasan yoban*****","12:00",R.drawable.check_white))
        mylist.add(ItemModel(R.drawable.person5,"Bitta Darmayed", "Salom Birat","08:22",R.drawable.check_white))
        mylist.add(ItemModel(R.drawable.person6,"Bitta Qiz", "Assalomu aleykum ***** aka","01:23",R.drawable.doublecheck_white))
        mylist.add(ItemModel(R.drawable.person7,"Bitta Kal", "Salom","17:36",R.drawable.doublecheck_white))
        mylist.add(ItemModel(R.drawable.person8,"Yana bitta kal", "Yana salom","10:55",R.drawable.doublecheck_white))
        mylist.add(ItemModel(R.drawable.person9,"Bitta jigit", "Qale brat","23:18",R.drawable.doublecheck_white))
        mylist.add(ItemModel(R.drawable.person9,"Bitta jigit", "Qale brat","23:18",R.drawable.doublecheck_white))
        mylist.add(ItemModel(R.drawable.person9,"Bitta jigit", "Qale brat","23:18",R.drawable.doublecheck_white))
        mylist.add(ItemModel(R.drawable.person9,"Bitta jigit", "Qale brat","23:18",R.drawable.doublecheck_white))
        mylist.add(ItemModel(R.drawable.person9,"Bitta jigit", "Qale brat","23:18",R.drawable.doublecheck_white))
        mylist.add(ItemModel(R.drawable.person10,"Bitta Bacha", "Ertaga kjefvbkefhvbefivgeivgergeierifgeuifgirfgeuiguigfuiwfhiufgriufehifhiegieufhgeuigeuigheuiheivbeiverbvuierhguierguikqejy","14:00",R.drawable.doublecheck_white))


        recycler.adapter = HomeAdapter(mylist)

    }
}