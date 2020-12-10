package com.hll.myretrofitdemo.network

import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.Type

object RetrofitManager {

    public val myRetrofit  = Retrofit.Builder().baseUrl("").addCallAdapterFactory(object:
        CallAdapter.Factory() {
        override fun get(
            returnType: Type,
            annotations: Array<Annotation>,
            retrofit: Retrofit
        ): CallAdapter<*, *>? {

            return null
        }

    }).build()



}