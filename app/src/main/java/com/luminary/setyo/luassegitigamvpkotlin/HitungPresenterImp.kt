package com.luminary.setyo.luassegitigamvpkotlin

import android.widget.EditText

/**
 * Created by root on 17/02/18.
 */
class HitungPresenterImp : HitungPresenter{

    var modelview : MainView? = null

    constructor(modelview: MainView?) {
        this.modelview = modelview
    }

    override fun hitungluas(nilai1: EditText, nilai2: EditText) {
        //ambil inputan user
        var a = nilai1.text.toString()
        var t = nilai2.text.toString()

        if (a.isNotEmpty() || t.isNotEmpty()) {


            //convert string ke double
            var alas = a.toDouble()
            var tinggi = t.toDouble()

            //masukin kerumus
            var hasil = 0.5 * alas * tinggi

            //masukin ke mainView
            modelview?.hasil(hasil.toString())
        }else{
            modelview?.kosong()
        }

    }




}