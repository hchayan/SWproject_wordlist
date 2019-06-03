package com.example.worldlist_2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

@SuppressLint("Registered")
public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button a =(Button) findViewById(R.id.menu_b1);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(
                        getApplicationContext(),
                        word.class
                );
                startActivity(intent1);
            }
        });

         Button b = (Button) findViewById(R.id.menu_b2);
         b.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent2 =new Intent(
                         getApplicationContext(),
                         AlarmActivity.class
                 );
                 startActivity(intent2);
             }
         });

        Button c = (Button) findViewById(R.id.menu_b3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        alarmscreen.class); // 다음 넘어갈 클래스 지정
                startActivity(intent3); // 다음 화면으로 넘어간다
            }
        });
        Button back = (Button) findViewById(R.id.menu_b4);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });// end onCreate()
    }

}
