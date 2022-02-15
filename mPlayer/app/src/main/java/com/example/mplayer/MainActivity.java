package com.example.mplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.samsungnote21);

        Button playButton = (Button) findViewById(R.id.play_view);
        playButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                mediaPlayer.start();
            }
        });

        Button pauseButton = (Button) findViewById(R.id.pause_view);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }
}