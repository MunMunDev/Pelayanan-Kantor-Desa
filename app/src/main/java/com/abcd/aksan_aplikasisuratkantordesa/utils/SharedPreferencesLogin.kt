package com.abcd.aksan_aplikasisuratkantordesa.utils

import android.content.Context
import com.abcd.aksan_aplikasisuratkantordesa.data.model.UsersModel

class SharedPreferencesLogin(val context: Context) {
    val keyIdUser = "keyIdUser"
    val keyIdWo = "keyIdWo"
    val keyNama = "keyNama"
    val keyAlamat = "keyAlamat"
    val keyNomorHp = "keyNomorHp"
    val keyUsername = "keyUsername"
    val keyPassword = "keyPassword"
    val keySebagai = "keySebagai"

    // If login Wedding Organizer
    val keyLogo = "keyLogo"
    val keyDeskripsi = "keyDeskripsi"

    var sharedPref = context.getSharedPreferences("sharedpreference_login", Context.MODE_PRIVATE)
    var editPref = sharedPref.edit()

    fun setLogin(id_user:Int, id_wo:Int, nama:String, alamat:String, nomorHp:String, username:String, password:String, sebagai:String){
        editPref.apply{
            putInt(keyIdUser, id_user)
            putInt(keyIdWo, id_wo)
            putString(keyNama, nama)
            putString(keyNomorHp, nomorHp)
            putString(keyAlamat, alamat)
            putString(keyUsername, username)
            putString(keyPassword, password)
            putString(keySebagai, sebagai)

            apply()
        }
    }

    fun setLogin(id_user:Int, id_wo:Int, nama:String, alamat:String, nomorHp:String, username:String, password:String, sebagai:String, deskripsi:String, logo:String){
        editPref.apply{
            putInt(keyIdUser, id_user)
            putInt(keyIdWo, id_wo)
            putString(keyNama, nama)
            putString(keyNomorHp, nomorHp)
            putString(keyAlamat, alamat)
            putString(keyUsername, username)
            putString(keyPassword, password)
            putString(keySebagai, sebagai)
            putString(keyDeskripsi, deskripsi)
            putString(keyLogo, logo)

            apply()
        }
    }

    fun getIdUser(): Int{
        return sharedPref.getInt(keyIdUser, 0)
    }
    fun getIdWO(): Int{
        return sharedPref.getInt(keyIdWo, 0)
    }
    fun getNama():String{
        return sharedPref.getString(keyNama, "").toString()
    }
    fun getAlamat():String{
        return sharedPref.getString(keyAlamat, "").toString()
    }
    fun getNomorHp():String{
        return sharedPref.getString(keyNomorHp, "").toString()
    }
    fun getUsername():String{
        return sharedPref.getString(keyUsername, "").toString()
    }
    fun getPassword(): String{
        return sharedPref.getString(keyPassword, "").toString()
    }
    fun getSebagai(): String{
        return sharedPref.getString(keySebagai, "").toString()
    }
    fun getDeskripsi(): String{
        return sharedPref.getString(keyDeskripsi, "").toString()
    }
    fun getLogo(): String{
        return sharedPref.getString(keyLogo, "").toString()
    }
}