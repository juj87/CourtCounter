package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Tracks the score for Team A

    int scoreTeamA = 0;
    int shotTeamA = 0;
    int yellowTeamA = 0;
    int redTeamA = 0;
    int cornerTeamA = 0;

    //Tracks the score for Team B

    int scoreTeamB = 0;
    int shotTeamB = 0;
    int yellowTeamB = 0;
    int redTeamB = 0;
    int cornerTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increases the score for Team A by 1.
     */

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases the number of shot attempts for Team A by 1.
     */

    public void addShotForTeamA(View v) {
        shotTeamA = shotTeamA + 1;
        displayForShotTeamA(shotTeamA);
    }

    /**
     * Increases the number of yellow cards for Team A by 1.
     */

    public void addYellowForTeamA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayForYellowTeamA(yellowTeamA);
    }

    /**
     * Increases the number of red cards for Team A by 1.
     */

    public void addRedForTeamA(View v) {
        redTeamA = redTeamA + 1;
        displayForRedTeamA(redTeamA);
    }

    /**
     * Increases the number of corners for Team A by 1.
     */

    public void addCornerForTeamA(View v) {
        cornerTeamA = cornerTeamA + 1;
        displayForCornerTeamA(cornerTeamA);
    }

    /**
     * Increases the score for Team B by 1.
     */

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases the number of shot attempts for Team B by 1.
     */

    public void addShotForTeamB(View v) {
        shotTeamB = shotTeamB + 1;
        displayForShotTeamB(shotTeamB);
    }

    /**
     * Increases the number of yellow cards for Team B by 1.
     */

    public void addYellowForTeamB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayForYellowTeamB(yellowTeamB);
    }

    /**
     * Increases the number of red cards for Team B by 1.
     */

    public void addRedForTeamB(View v) {
        redTeamB = redTeamB + 1;
        displayForRedTeamB(redTeamB);
    }

    /**
     * Increases the number of corners for Team B by 1.
     */

    public void addCornerForTeamB(View v) {
        cornerTeamB = cornerTeamB + 1;
        displayForCornerTeamB(cornerTeamB);
    }

    /**
     * Reset the score for both teams back to 0.
     */

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        shotTeamA = 0;
        shotTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        cornerTeamA = 0;
        cornerTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForShotTeamA(shotTeamA);
        displayForShotTeamB(shotTeamB);
        displayForYellowTeamA(yellowTeamA);
        displayForYellowTeamB(yellowTeamB);
        displayForRedTeamA(redTeamA);
        displayForRedTeamB(redTeamB);
        displayForCornerTeamA(cornerTeamA);
        displayForCornerTeamB(cornerTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of shots for Team A.
     */
    public void displayForShotTeamA(int shot) {
        TextView shotView = (TextView) findViewById(R.id.shot_a_score);
        shotView.setText(String.valueOf(shot));
    }

    /**
     * Displays the number of yellow cards for Team A
     */
    public void displayForYellowTeamA(int yellow) {
        TextView yellowView = (TextView) findViewById(R.id.yellow_card_a_score);
        yellowView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the number of red cards for Team A
     */
    public void displayForRedTeamA(int red) {
        TextView redView = (TextView) findViewById(R.id.red_card_a_score);
        redView.setText(String.valueOf(red));
    }

    /**
     * Displays the number of corners for Team A
     */
    public void displayForCornerTeamA(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.corner_a_score);
        cornerView.setText(String.valueOf(corner));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of shots for Team B.
     */
    public void displayForShotTeamB(int shot) {
        TextView shotView = (TextView) findViewById(R.id.shot_b_score);
        shotView.setText(String.valueOf(shot));
    }

    /**
     * Displays the number of yellow cards for Team B
     */
    public void displayForYellowTeamB(int yellow) {
        TextView yellowView = (TextView) findViewById(R.id.yellow_card_b_score);
        yellowView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the number of red cards for Team B
     */
    public void displayForRedTeamB(int red) {
        TextView redView = (TextView) findViewById(R.id.red_card_b_score);
        redView.setText(String.valueOf(red));
    }

    /**
     * Displays the number of corners for Team B
     */
    public void displayForCornerTeamB(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.corner_b_score);
        cornerView.setText(String.valueOf(corner));
    }
}
