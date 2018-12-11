package com.example.user.final_android_advanced.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.user.final_android_advanced.Adapters.RecyclerAdapter
import com.example.user.final_android_advanced.ApplicationDB
import com.example.user.final_android_advanced.Data.Room.Room.ContactDAO
import com.example.user.final_android_advanced.Data.Room.Room.ContactListEntity
import com.example.user.final_android_advanced.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var contactDAO: ContactDAO
    private var list:ArrayList<ContactListEntity> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contactDAO = (applicationContext as ApplicationDB).myDB.contactDao()
        list = contactDAO.getContact() as ArrayList<ContactListEntity>
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(this,list)

        fab.setOnClickListener{
            val intent = Intent(this,AddContactActivity::class.java)
            startActivity(intent)
        }
    }
}
