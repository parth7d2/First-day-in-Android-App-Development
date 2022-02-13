package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word ("Where are you going?", "Aap kaha ja rahe ho?"));
        words.add(new Word ("What is your name?", "Aapka naam kya hai"));
        words.add(new Word ("My name is ", "Parth7D2"));
        words.add(new Word ("How are you feeling", "Good"));
        words.add(new Word ("I'm feeling good ", "Patel"));
        words.add(new Word ("Are you coming ", "Aap aa rahe ho?"));
        words.add(new Word ("Yes, I'm coming", "Ha me aa raha hu"));
        words.add(new Word ("I'm coming", "Me aa raha hu"));

        WordAdaptor Adapter = new WordAdaptor(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}