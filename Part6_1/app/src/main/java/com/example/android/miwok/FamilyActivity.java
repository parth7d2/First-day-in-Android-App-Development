package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word ("Grand Father", "Dada"));
        words.add(new Word ("Grand Mother", "Dadi"));
        words.add(new Word ("Father", "Pappa"));
        words.add(new Word ("Mother", "Mammi"));
        words.add(new Word ("Son", "Bhai"));
        words.add(new Word ("Daughter", "Bahen"));
        WordAdaptor Adapter = new WordAdaptor(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}