package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
//        String[] words = new String[10];
//        words[0] = "One";
//        words[1] = "Two";
//        words[2] = "Three";
//        words[3] = "Four";
//        words[4] = "Five";
//        words[5] = "Six";
//        words[6] = "Seven";
//        words[7] = "Eight";
//        words[8] = "Nine";
//        words[9] = "Ten"; ----> or
//        String[] words = {"One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten"};

        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}