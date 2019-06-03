package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Alarmset_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarmset_activity);
    }
    public void onClick(View v) {
        Intent intent_01 = new Intent(getApplicationContext(), Alarm_activity.class);
        startActivity(intent_01);
    }
}
