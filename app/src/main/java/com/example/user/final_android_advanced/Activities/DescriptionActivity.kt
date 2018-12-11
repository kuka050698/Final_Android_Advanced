package com.example.user.final_android_advanced.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.user.final_android_advanced.ApplicationDB
import com.example.user.final_android_advanced.Data.Room.Room.ContactDAO
import com.example.user.final_android_advanced.Data.Room.Room.ContactListEntity
import com.example.user.final_android_advanced.R
import kotlinx.android.synthetic.main.activity_description.*

class DescriptionActivity : AppCompatActivity() {
    private lateinit var contactDAO:ContactDAO
    private lateinit var list:ArrayList<ContactListEntity>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        contactDAO = (applicationContext as ApplicationDB).myDB.contactDao()
//        var contact:ContactListEntity
//
//        mob_descr_name.text = contact.mob_number
//        home_descr_name.text = contact.home_number

    }
}
