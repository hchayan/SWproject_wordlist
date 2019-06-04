package com.example.worldlist_2

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View as View1
import android.widget.Toast as Toast1

@SuppressLint("Registered")
class Alarmset_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarmset_activity)
    }



    fun View1.onClick_1() {
        val toast_01 = Toast1.makeText(this@Alarmset_activity, "알람이 설정되었습니다.", Toast1.LENGTH_SHORT)
        toast_01.show()
    }
}