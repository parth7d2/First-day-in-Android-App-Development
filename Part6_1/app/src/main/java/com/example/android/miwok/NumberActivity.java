package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    private MediaPlayer mMidiaPlayer;

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

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word ("One", "Ek", R.drawable.number_one, R.raw.number_one));
        words.add(new Word ("Two", "Do", R.drawable.number_two, R.raw.number_two));
        words.add(new Word ("Three", "Tin", R.drawable.number_three, R.raw.number_three));
        words.add(new Word ("Four", "Char", R.drawable.number_four, R.raw.number_four));
        words.add(new Word ("Five", "Panch", R.drawable.number_five, R.raw.number_five));
        words.add(new Word ("Six", "Che", R.drawable.number_six, R.raw.number_six));
        words.add(new Word ("Seven", "Sat", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word ("Eight", "Ad", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word ("Nine", "Nav", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word ("Ten", "Das", R.drawable.number_ten, R.raw.number_ten));


        WordAdaptor Adapter = new WordAdaptor(this,words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mMidiaPlayer = MediaPlayer.create(NumberActivity.this, word.getmAudioResourseId());
                mMidiaPlayer.start();
                mMidiaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releseMediaPlayer();
                    }
                });
            }
        });
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