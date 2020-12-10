package com.hll.myretrofitdemo.network

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface GetUserData {

    @POST(value = "getUserInfo/main")
    fun getUserInfo(@Body body: RequestData, @Query(value = "user_name") name: String):Observable<ResponseData>
}