package com.example.worldlist_2;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;



import android.widget.EditText;

import android.view.View;

import android.widget.TextView;



import java.lang.String;

import java.util.Map;

import java.util.HashMap;
public class word extends AppCompatActivity {



    //사전 데이터 생성

    Map<String, String> dict = new HashMap<String, String>();







    //단어리스트 생성

    Map<String, String> wordlist = new HashMap<String, String>();



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_word);

        dict.put("apple", "사과");

        dict.put("contribution", "기부금");



    }



    public void onClickAppend(View v){

        EditText text1= (EditText) findViewById(R.id.word);

        String words = text1.getText().toString();



        EditText text2 = (EditText) findViewById(R.id.sentence);

        String sentence = text2.getText().toString();



        wordlist.put(words, sentence);



        //테스트

        TextView res = (TextView) findViewById(R.id.textView_word_list);



        res.append(wordlist.toString());



    }



    public void onClickFindWord(View v){

        EditText text = (EditText) findViewById(R.id.word);

        EditText text2 = (EditText) findViewById(R.id.sentence);

        String t = text.getText().toString();



        if(dict.containsKey(t) == true) {

            text2.setText(dict.get(t));

        }

        else{

            text2.setText("no data");

        }

    }











}
