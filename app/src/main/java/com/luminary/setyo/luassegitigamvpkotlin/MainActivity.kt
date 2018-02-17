package com.luminary.setyo.luassegitigamvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    lateinit var presenter : HitungPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initView() {
        bt1.setOnClickListener {
            presenter.hitungluas(edt1,edt2)
        }
    }


    override fun kosong() {
        Toast.makeText(this,"Kosong",Toast.LENGTH_LONG).show()
    }

    override fun hasil(toString: String) {
        tv1.text=toString
    }


    private fun initPresenter() {
        presenter = HitungPresenterImp(this)
    }
}
