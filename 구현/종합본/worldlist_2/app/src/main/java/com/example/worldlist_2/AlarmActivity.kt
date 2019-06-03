package com.example.worldlist_2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class AlarmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarm_activity)
    }

    fun View.onClick_1() {
        val intent_01 = Intent(applicationContext, Alarmset_activity::class.java)
        startActivity(intent_01)
    }

    fun View.onClick_2() {
        val toast_01 = Toast.makeText(this@AlarmActivity, "알람이 해제되었습니다.", Toast.LENGTH_SHORT)
        toast_01.show()
    }
}