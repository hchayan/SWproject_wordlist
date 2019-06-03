package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class Alarm_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_01(View v) {
        Intent intent_01 = new Intent(getApplicationContext(), Alarmset_activity.class);
        startActivity(intent_01);
    }
    public void onClick_02(View v) {
        Toast toast_01 = Toast.makeText(this, "알람이 해제되었습니다.", Toast.LENGTH_SHORT);
        toast_01.show();
    }
}
