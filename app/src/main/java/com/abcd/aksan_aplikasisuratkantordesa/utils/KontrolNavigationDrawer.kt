package com.abcd.aksan_aplikasisuratkantordesa.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.abcd.aksan_aplikasisuratkantordesa.ui.activity.user.main.MainActivity
import com.abcd.aksan_aplikasisuratkantordesa.R
import com.abcd.aksan_aplikasisuratkantordesa.ui.activity.combination.login.LoginActivity

class KontrolNavigationDrawer(var context: Context) {
    var sharedPreferences = SharedPreferencesLogin(context)
    fun cekSebagai(navigation: com.google.android.material.navigation.NavigationView){
        if(sharedPreferences.getSebagai() == "user") {
            navigation.menu.clear()
            navigation.inflateMenu(R.menu.nav_menu_user)
        } else if(sharedPreferences.getSebagai() == "admin"){
            navigation.menu.clear()
            navigation.inflateMenu(R.menu.nav_menu_admin)
        }
    }
    @SuppressLint("ResourceAsColor")
    fun onClickItemNavigationDrawer(navigation: com.google.android.material.navigation.NavigationView, navigationLayout: DrawerLayout, igNavigation:ImageView, activity: Activity){
        navigation.setNavigationItemSelectedListener {
            if(sharedPreferences.getSebagai() == "user"){
                when(it.itemId){
                    R.id.userNavDrawerHome -> {
                        val intent = Intent(context, MainActivity::class.java)
                        context.startActivity(intent)
                        activity.finish()
                    }

                    R.id.userBtnKeluar ->{
                        logout(activity)
                    }
                }
            }
            else if(sharedPreferences.getSebagai() == "admin"){
                when(it.itemId){
//                    R.id.adminNavDrawerHome -> {
//                        val intent = Intent(context, AdminMainActivity::class.java)
//                        context.startActivity(intent)
//                        activity.finish()
//                    }
//                    R.id.adminNavDrawerAkunWo -> {
//                        val intent = Intent(context, AdminWeddingOrganizerActivity::class.java)
//                        context.startActivity(intent)
//                        activity.finish()
//                    }
//                    R.id.adminNavDrawerAkunUser -> {
//                        val intent = Intent(context, AdminUserActivity::class.java)
//                        context.startActivity(intent)
//                        activity.finish()
//                    }
//                    R.id.adminNavDrawerTestimoni -> {
//                        val intent = Intent(context, AdminTestimoniActivity::class.java)
//                        context.startActivity(intent)
//                        activity.finish()
//                    }

                    R.id.adminBtnKeluar ->{
                        logout(activity)
                    }
                }

            }
            navigationLayout.setBackgroundColor(R.color.white)
            navigationLayout.closeDrawer(GravityCompat.START)
            true
        }
        // garis 3 navigasi
        igNavigation.setOnClickListener {
            navigationLayout.openDrawer(GravityCompat.START)
        }
    }

    fun logout(activity: Activity){
        sharedPreferences.setLogin(0, 0,"", "","", "","", "","", "")
        context.startActivity(Intent(context, LoginActivity::class.java))
        activity.finish()

    }
}