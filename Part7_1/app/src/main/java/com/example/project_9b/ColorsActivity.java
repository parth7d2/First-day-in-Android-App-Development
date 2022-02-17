package com.example.android.project_9b;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMidiaPlayer;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releseMediaPlayer();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word ("Red", "Lal", R.drawable.color_red, R.raw.color_red));
        words.add(new Word ("Yellow", "Peela", R.drawable.color_mustard_yellow,R.raw.color_dusty_yellow));
        words.add(new Word ("Dusty Yellow", "Dudhiyo", R.drawable.color_dusty_yellow, R.raw.color_mustard_yellow));
        words.add(new Word ("Green", "Hara", R.drawable.color_green, R.raw.color_green));
        words.add(new Word ("Gray", "Rakhodi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word ("Brown", "Katthai", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word ("Black", "Kala", R.drawable.color_black, R.raw.color_black));
        words.add(new Word ("White", "Safed", R.drawable.color_white, R.raw.color_white));


        WordAdaptor Adapter = new WordAdaptor(this,words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                releseMediaPlayer();

                mMidiaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmAudioResourseId());
                mMidiaPlayer.start();
                mMidiaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    @Override
    protected void onStop(){
        super.onStop();
        releseMediaPlayer();
    }

    private void releseMediaPlayer()
    {
        if(mMidiaPlayer != null)
        {
            mMidiaPlayer.release();
            mMidiaPlayer = null;
        }
    }
}