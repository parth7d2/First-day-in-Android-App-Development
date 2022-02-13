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
        words.add(new Word ("Red", "Lal"));
        words.add(new Word ("Yellow", "Peela"));
        words.add(new Word ("Orange", "Kesari"));
        words.add(new Word ("Green", "Hara"));
        words.add(new Word ("Blue", "Asmani"));
        words.add(new Word ("Pink", "Gulabi"));
        words.add(new Word ("Black", "Kala"));
        words.add(new Word ("White", "Safed"));


        WordAdaptor Adapter = new WordAdaptor(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}