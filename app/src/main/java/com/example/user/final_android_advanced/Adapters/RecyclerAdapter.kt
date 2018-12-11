package com.example.user.final_android_advanced.Adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.user.final_android_advanced.Activities.DescriptionActivity
import com.example.user.final_android_advanced.Data.Room.Room.ContactListEntity
import com.example.user.final_android_advanced.R
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerAdapter(private val context:Context,private val list:List<ContactListEntity>):
        RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.itemView.name.text = list[p1].name
        p0.itemView.contact_group_name.text = list[p1].contact_group
        p0.itemView.setOnClickListener{
            val intent = Intent(context, DescriptionActivity::class.java)
            //intent.putExtra("contact_group",list[p1])
            context.startActivity(intent)
        }

    }

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

}