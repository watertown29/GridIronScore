package com.example.gridironscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHome = 0;
    int scoreAway= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSixHome(View  view) {
        scoreHome = scoreHome + 6;
        displayHome(scoreHome);
    }

    public void addOneHome(View  view) {
        scoreHome = scoreHome + 1;
        displayHome(scoreHome);
    }

    public void addThreeHome(View  view) {
        scoreHome = scoreHome + 3;
        displayHome(scoreHome);
    }

    public void addTwoHome(View  view) {
        scoreHome = scoreHome + 2;
        displayHome(scoreHome);
    }

    public void addSixAway(View view) {
        scoreAway = scoreAway + 6;
        displayAway(scoreAway);
    }

    public void addOneAway(View view) {
        scoreAway = scoreAway + 1;
        displayAway(scoreAway);
    }

    public void addThreeAway(View view) {
        scoreAway = scoreAway + 3;
        displayAway(scoreAway);
    }

    public void addTwoAway(View view) {
        scoreAway = scoreAway + 2;
        displayAway(scoreAway);
    }

    public void reset(View view) {
        scoreHome = 0;
        scoreAway = 0;
        displayHome(scoreHome);
        displayAway(scoreAway);
    }

    public void displayHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.awayScore);
        scoreView.setText(String.valueOf(score));
    }
}
