package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word ("Red", "Lal", R.drawable.color_red));
        words.add(new Word ("Yellow", "Peela", R.drawable.color_mustard_yellow));
        words.add(new Word ("Dusty Yellow", "Dudhiyo", R.drawable.color_dusty_yellow));
        words.add(new Word ("Green", "Hara", R.drawable.color_green));
        words.add(new Word ("Gray", "Rakhodi", R.drawable.color_gray));
        words.add(new Word ("Brown", "Katthai", R.drawable.color_brown));
        words.add(new Word ("Black", "Kala", R.drawable.color_black));
        words.add(new Word ("White", "Safed", R.drawable.color_white));


        WordAdaptor Adapter = new WordAdaptor(this,words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}