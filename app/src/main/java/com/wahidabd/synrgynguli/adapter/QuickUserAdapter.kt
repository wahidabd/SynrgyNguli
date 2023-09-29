package com.wahidabd.synrgynguli.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wahidabd.synrgynguli.R
import com.wahidabd.synrgynguli.model.QuickUserModel

class QuickUserAdapter(private val list: List<QuickUserModel>): RecyclerView.Adapter<QuickUserAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val profileUser = itemView.findViewById<ImageView>(R.id.iv_profileUser)
        val username = itemView.findViewById<TextView>(R.id.tv_username)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.list_user_transfer, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user: QuickUserModel = list[position]
        holder.profileUser.setImageResource(user.profileUser)
        holder.username.text = user.username
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}