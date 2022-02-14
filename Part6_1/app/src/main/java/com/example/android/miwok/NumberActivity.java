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
        words.add(new Word ("One", "Ek", R.drawable.number_one));
        words.add(new Word ("Two", "Do", R.drawable.number_two));
        words.add(new Word ("Three", "Tin", R.drawable.number_three));
        words.add(new Word ("Four", "Char", R.drawable.number_four));
        words.add(new Word ("Five", "Panch", R.drawable.number_five));
        words.add(new Word ("Six", "Che", R.drawable.number_six));
        words.add(new Word ("Seven", "Sat", R.drawable.number_seven));
        words.add(new Word ("Eight", "Ad", R.drawable.number_eight));
        words.add(new Word ("Nine", "Nav", R.drawable.number_nine));
        words.add(new Word ("Ten", "Das", R.drawable.number_ten));


        WordAdaptor Adapter = new WordAdaptor(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}