package com.example.android.project_9b;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
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
        words.add(new Word ("Grand Father", "Dada", R.drawable.family_grandfather, R.raw.family_grandfather));
        words.add(new Word ("Grand Mother", "Dadi", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word ("Father", "Pappa", R.drawable.family_father, R.raw.family_father));
        words.add(new Word ("Mother", "Mammi", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word ("Son", "Bhai", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word ("Daughter", "Bahen", R.drawable.family_older_sister, R.raw.family_older_sister));
        WordAdaptor Adapter = new WordAdaptor(this,words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                releseMediaPlayer();
                mMidiaPlayer = MediaPlayer.create(FamilyActivity.this, word.getmAudioResourseId());
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