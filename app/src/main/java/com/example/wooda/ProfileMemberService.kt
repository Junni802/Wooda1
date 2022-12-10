package com.example.wooda

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface ProfileMemberService {
    @FormUrlEncoded
    @POST("/MemberInfo")
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=utf-8")
    fun requestMemberInfo(
        @Field("email") email:String
    ) : Call<ProfileMemberData>
}