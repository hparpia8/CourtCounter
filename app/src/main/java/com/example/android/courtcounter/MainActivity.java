package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    //adds threer points for team A
    public void addThreeForTeamA(View view){
        final int THREE_POINTS = 3;
        scoreTeamA = scoreTeamA +THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    //adds two points for team A
    public void addTwoForTeamA(View view){
        final int TW0_POINTS = 2;
        scoreTeamA = scoreTeamA + TW0_POINTS;
        displayForTeamA(scoreTeamA);
    }

    //adds one point for team A
    public void addOneForTeamA(View view){
        final int FREE_THROW_POINT = 1;
        scoreTeamA = scoreTeamA + FREE_THROW_POINT;
        displayForTeamA(scoreTeamA);
    }

    //adds 3 points to team B
    public void addThreeForTeamB(View view){
        final int THREE_POINTS = 3;
        scoreTeamB = scoreTeamB +THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    //adds two points for team B
    public void addTwoForTeamB(View view){
        final int TW0_POINTS = 2;
        scoreTeamB = scoreTeamB + TW0_POINTS;
        displayForTeamB(scoreTeamB);
    }

    //Adds One point for team B
    public void addOneForTeamB(View view){
        final int FREE_THROW_POINT = 1;
        scoreTeamB = scoreTeamB + FREE_THROW_POINT;
        displayForTeamB(scoreTeamB);
    }

    //This resets the score to 0
    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
