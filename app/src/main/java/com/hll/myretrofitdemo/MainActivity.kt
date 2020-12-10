package com.hll.myretrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hll.myretrofitdemo.network.GetUserData
import com.hll.myretrofitdemo.network.RequestData
import com.hll.myretrofitdemo.network.RetrofitManager
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val service = RetrofitManager.myRetrofit.create(GetUserData::class.java)
        val userInfo1 = service.getUserInfo(RequestData(), "")

        val disposable:Disposable = userInfo1
            .map {
                return@map 0
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {


                Log.d("TAG", "onCreate: $it")
            }

    }


}