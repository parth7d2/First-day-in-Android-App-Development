package com.example.project_3b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAscore = 0;
    int teamBscore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View v) {
        teamAscore = teamAscore + 3;
        displayForTeamA(teamAscore);
    }

    public void addTwoForTeamA(View v) {
        teamAscore = teamAscore + 2;
        displayForTeamA(teamAscore);
    }

    public void addOneForTeamA(View v) {
        teamAscore = teamAscore + 1;
        displayForTeamA(teamAscore);
    }

    public void displaForTeamB(int score) {
        TextView scoreview1 = (TextView) findViewById(R.id.team_b_score);
        scoreview1.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View view) {
        teamBscore = teamBscore + 3;
        displaForTeamB(teamBscore);
    }

    public void addTwoForTeamB(View view) {
        teamBscore = teamBscore + 2;
        displaForTeamB(teamBscore);
    }

    public void addOneForTeamB(View view) {
        teamBscore = teamBscore + 1;
        displaForTeamB(teamBscore);
    }

    public void resetScore(View v) {
        teamAscore = 0;
        displayForTeamA(teamAscore);
        teamBscore = 0;
        displaForTeamB(teamBscore);
    }


}