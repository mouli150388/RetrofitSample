package com.royalit.retrofitsample

import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RemoteInterface {
    @POST("customers/login")
    fun callLoginApi(
        @Body body: RequestBody,
    ): Call<LoginDataModel>
}