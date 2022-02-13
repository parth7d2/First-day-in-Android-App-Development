package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
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

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word ("One", "Ek"));
        words.add(new Word ("Two", "Do"));
        words.add(new Word ("Three", "Tin"));
        words.add(new Word ("Four", "Char"));
        words.add(new Word ("Five", "Panch"));
        words.add(new Word ("Six", "Che"));
        words.add(new Word ("Seven", "Sat"));
        words.add(new Word ("Eight", "Ad"));
        words.add(new Word ("Nine", "Nav"));
        words.add(new Word ("Ten", "Das"));


        WordAdaptor Adapter = new WordAdaptor(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}