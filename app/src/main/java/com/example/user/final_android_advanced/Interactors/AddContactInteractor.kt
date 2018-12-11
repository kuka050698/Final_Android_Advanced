package com.example.user.final_android_advanced.Interactors

import com.example.user.final_android_advanced.ApplicationDB
import com.example.user.final_android_advanced.Data.Room.Room.ContactDAO
import com.example.user.final_android_advanced.Data.Room.Room.ContactListEntity

class AddContactInteractor:AddContactInteractorView {
    private lateinit var contacts:ContactDAO
    private var list:ArrayList<ContactListEntity> = ArrayList()
    override fun addContact(contact: ContactListEntity, listener: AddContactInteractorView.onFinishedListener) {
         val contact = ContactListEntity(contact.id,contact.name,contact.mob_number,contact.home_number,contact.work_number
        ,contact.contact_group)
         contacts = ApplicationDB().myDB.contactDao()
        contacts.addContact(contact)

    }
}