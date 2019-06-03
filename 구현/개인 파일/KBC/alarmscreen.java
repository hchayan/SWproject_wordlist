package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.Context;
import android.widget.Button;
import android.view.View;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class alarmscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarmscreen);



        Button alarmbutton = (Button) findViewById(R.id.alarm_b1);
        alarmbutton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(alarmscreen.this);
                builder.setMessage("화면잠금 설정")
                .setCancelable(false)
                .setPositiveButton("No", new DialogInterface.OnClickListener(){

                            public void onClick(DialogInterface dialog, int i){
                                dialog.cancel();
                            }
                        })
                 .setNegativeButton("Yes",  new DialogInterface.OnClickListener(){


                     public void onClick(DialogInterface dialog, int i){
                         //finish();
                        Toast.makeText(getApplicationContext(), "화면잠금이 설정되었습니다.", Toast.LENGTH_SHORT).show();

                     }
                 });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        Button  alarmexitutton = (Button) findViewById(R.id.alarm_b2);
        alarmexitutton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(alarmscreen.this);
                builder.setMessage("화면잠금 해제")
                        .setCancelable(false)
                        .setPositiveButton("No", new DialogInterface.OnClickListener(){

                            public void onClick(DialogInterface dialog, int i){
                                dialog.cancel();
                            }
                        })
                        .setNegativeButton("Yes",  new DialogInterface.OnClickListener(){


                            public void onClick(DialogInterface dialog, int i){

                                Toast.makeText(getApplicationContext(), "화면잠금이 해제되었습니다.", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }

        });
        Button back = (Button) findViewById(R.id.alarm_b3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });
    }
}