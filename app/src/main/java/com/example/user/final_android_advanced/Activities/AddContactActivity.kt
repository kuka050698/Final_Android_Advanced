package com.example.user.final_android_advanced.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.user.final_android_advanced.ApplicationDB
import com.example.user.final_android_advanced.Data.Room.Room.ContactListEntity
import com.example.user.final_android_advanced.Interactors.AddContactInteractor
import com.example.user.final_android_advanced.Interactors.AddContactInteractorView
import com.example.user.final_android_advanced.Presenters.AddContactPresenter
import com.example.user.final_android_advanced.R
import com.example.user.final_android_advanced.Views.AddContactView
import kotlinx.android.synthetic.main.activity_add_contact.*

class AddContactActivity : AppCompatActivity(),AddContactView {
    override fun onSuccess() {
        Log.d("Conract added","Successfully")
    }

    override fun onFailed() {
        Log.d("Conract added","Failed")
    }

    lateinit var presenter:AddContactPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)
        presenter = AddContactPresenter(this,AddContactInteractor())
        add.setOnClickListener{
//            presenter.add(ContactListEntity(1,contact_name.text.toString(),mobile_number.text.toString()
//            ,home_number.text.toString(),work_number.text.toString(),contact_group.text.toString()))
//            Toast.makeText(this,"Added",Toast.LENGTH_SHORT).show()
            var contact = ContactListEntity(1,contact_name.text.toString(),mobile_number.text.toString()
        ,home_number.text.toString(),work_number.text.toString(),contact_group.text.toString())
            ApplicationDB().myDB.contactDao().addContact(contact)
            Toast.makeText(this,"Added successfully",Toast.LENGTH_SHORT).show()
        }
    }
}
