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
        words.add(new Word ("Grand Father", "Dada", R.drawable.family_grandfather));
        words.add(new Word ("Grand Mother", "Dadi", R.drawable.family_grandmother));
        words.add(new Word ("Father", "Pappa", R.drawable.family_father));
        words.add(new Word ("Mother", "Mammi", R.drawable.family_mother));
        words.add(new Word ("Son", "Bhai", R.drawable.family_younger_brother));
        words.add(new Word ("Daughter", "Bahen", R.drawable.family_older_sister));
        WordAdaptor Adapter = new WordAdaptor(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}