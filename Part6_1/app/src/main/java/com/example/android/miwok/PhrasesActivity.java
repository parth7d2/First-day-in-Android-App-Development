package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMidiaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word ("Where are you going?", "Aap kaha ja rahe ho?", R.raw.phrase_where_are_you_going));
        words.add(new Word ("What is your name?", "Aapka naam kya hai", R.raw.phrase_what_is_your_name));
        words.add(new Word ("My name is ", "Parth7D2", R.raw.phrase_my_name_is));
        words.add(new Word ("How are you feeling", "Good", R.raw.phrase_how_are_you_feeling));
        words.add(new Word ("I'm feeling good ", "Patel", R.raw.phrase_im_feeling_good));
        words.add(new Word ("Are you coming ", "Aap aa rahe ho?", R.raw.phrase_are_you_coming));
        words.add(new Word ("Yes, I'm coming", "Ha me aa raha hu", R.raw.phrase_im_coming));
        words.add(new Word ("I'm coming", "Me aa raha hu", R.raw.phrase_im_coming));

        WordAdaptor Adapter = new WordAdaptor(this,words,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mMidiaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourseId());
                mMidiaPlayer.start();
            }
        });
    }
}