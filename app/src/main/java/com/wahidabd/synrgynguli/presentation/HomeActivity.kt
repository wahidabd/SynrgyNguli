package com.wahidabd.synrgynguli.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.wahidabd.synrgynguli.R
import com.wahidabd.synrgynguli.adapter.QuickUserAdapter
import com.wahidabd.synrgynguli.databinding.ActivityHomeBinding
import com.wahidabd.synrgynguli.model.QuickUserModel

class HomeActivity : AppCompatActivity() {
    companion object{
        fun start(context: Context){
            context.startActivity(Intent(context, HomeActivity::class.java))
        }
    }
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        statusBarColor()
        bindViewModelProfileUser()
    }

    fun statusBarColor(){
        val color = ContextCompat.getColor(this, R.color.base_color)
        window.statusBarColor = color
    }

    fun bindViewModelProfileUser(){
        val recyclerView = binding.rvQuickTransferUser
        val user: List<QuickUserModel> = listOf(
            QuickUserModel(profileUser = R.drawable.profile_user6, username = "Bagus"),
            QuickUserModel(profileUser = R.drawable.profile_user1, username = "Wahid"),
            QuickUserModel(profileUser = R.drawable.profile_user2, username = "Hendardi"),
            QuickUserModel(profileUser = R.drawable.profile_user3, username = "Ilham"),
            QuickUserModel(profileUser = R.drawable.profile_user4, username = "Gina"),
            QuickUserModel(profileUser = R.drawable.profile_user5, username = "Febi"),
            QuickUserModel(profileUser = R.drawable.profile_user7, username = "Lukman"),
        )

        val adapter = QuickUserAdapter(user)
        recyclerView.adapter = adapter
    }
}