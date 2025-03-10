package com.abcd.aksan_aplikasisuratkantordesa.data.database.api

import com.abcd.aksan_aplikasisuratkantordesa.data.model.UsersModel
import com.abcd.vian_marketplaceweddingorganizer.data.model.ResponseModel
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Query

interface ApiService {
    @GET("marketplace-wo/api/get.php")
    suspend fun getAllUser(
        @Query("all_user") allUser: String
    ): ArrayList<UsersModel>

    @GET("marketplace-wo/api/get.php")
    suspend fun getUser(
        @Query("get_user") getUser: String,
        @Query("username") username: String,
        @Query("password") password: String
    ): ArrayList<UsersModel>


    // POST
    @FormUrlEncoded
    @POST("marketplace-wo/api/post.php")
    suspend fun addUser(
        @Field("add_user") addUser:String,
        @Field("nama") nama:String,
        @Field("alamat") alamat:String,
        @Field("nomor_hp") nomorHp:String,
        @Field("username") username:String,
        @Field("password") password:String,
        @Field("sebagai") sebagai:String
    ): ResponseModel

    @Multipart
    @POST("marketplace-wo/api/post.php")
    suspend fun addWo(
        @Part("add_wo") add_wo: RequestBody,
        @Part("nama") nama: RequestBody,
        @Part("alamat") alamat: RequestBody,
        @Part("nomor_hp") nomor_hp: RequestBody,
        @Part("username") username: RequestBody,
        @Part("password") password: RequestBody,
        @Part("sebagai") sebagai: RequestBody,
        @Part("deskripsi") deskripsi: RequestBody,
        @Part gambar: MultipartBody.Part,
    ): ResponseModel

    @FormUrlEncoded
    @POST("marketplace-wo/api/post.php")
    suspend fun postUpdateUser(
        @Field("update_akun") updateAkun:String,
        @Field("id_user") idUser: String,
        @Field("nama") nama:String,
        @Field("alamat") alamat:String,
        @Field("nomor_hp") nomorHp:String,
        @Field("username") username:String,
        @Field("password") password:String,
        @Field("username_lama") usernameLama: String
    ): ResponseModel

    @FormUrlEncoded
    @POST("marketplace-wo/api/post.php")
    suspend fun postHapusUser(
        @Field("hapus_akun") hapusAkun:String,
        @Field("id_user") idUser: String
    ): ResponseModel

}