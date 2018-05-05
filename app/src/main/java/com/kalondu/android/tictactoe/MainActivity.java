/*
 * Copyright 2018
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.kalondu.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scorePlayerX = 0;
    int scorePlayerO = 0;
    String textOne = "";
    String textTwo = "";
    String textThree = "";
    String textFour = "";
    String textFive = "";
    String textSix = "";
    String textSeven = "";
    String textEight = "";
    String textNine = "";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Launches the Tic-Tac-Toe screen.
     */
    public void startGame(View view) {

        ImageView startImageView = findViewById(R.id.cover);
        startImageView.setImageDrawable(null);

        CheckBox playerXTurn = findViewById(R.id.player_x_turn);
        playerXTurn.setVisibility(View.VISIBLE);

        CheckBox playerOTurn = findViewById(R.id.player_o_turn);
        playerOTurn.setVisibility(View.VISIBLE);

        TextView playerXScore = findViewById(R.id.player_x_score);
        playerXScore.setVisibility(View.VISIBLE);

        TextView playerOScore = findViewById(R.id.player_o_score);
        playerOScore.setVisibility(View.VISIBLE);

        TextView playerXWin = findViewById(R.id.player_x_win);
        playerXWin.setVisibility(View.VISIBLE);

        TextView playerOWin = findViewById(R.id.player_o_win);
        playerOWin.setVisibility(View.VISIBLE);

        Button playButton = findViewById(R.id.start_game);
        playButton.setVisibility(View.VISIBLE);

        Button resetButton = findViewById(R.id.reset);
        resetButton.setVisibility(View.VISIBLE);

        Button buttonOne = findViewById(R.id.box_one_view);
        buttonOne.setVisibility(View.VISIBLE);

        Button buttonTwo = findViewById(R.id.box_two_view);
        buttonTwo.setVisibility(View.VISIBLE);

        Button buttonThree = findViewById(R.id.box_three_view);
        buttonThree.setVisibility(View.VISIBLE);

        Button buttonFour = findViewById(R.id.box_four_view);
        buttonFour.setVisibility(View.VISIBLE);

        Button buttonFive = findViewById(R.id.box_five_view);
        buttonFive.setVisibility(View.VISIBLE);

        Button buttonSix = findViewById(R.id.box_six_view);
        buttonSix.setVisibility(View.VISIBLE);

        Button buttonSeven = findViewById(R.id.box_seven_view);
        buttonSeven.setVisibility(View.VISIBLE);

        Button buttonEight = findViewById(R.id.box_eight_view);
        buttonEight.setVisibility(View.VISIBLE);

        Button buttonNine = findViewById(R.id.box_nine_view);
        buttonNine.setVisibility(View.VISIBLE);


    }

    /**
     * Displays the given score for Player X.
     */
    public void displayForPlayerXScore(int score) {
        TextView scoreView = findViewById(R.id.player_x_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Player O.
     */
    public void displayForPlayerOScore(int score) {
        TextView scoreView = findViewById(R.id.player_o_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForPlayerX(String msg) {
        TextView scoreView = findViewById(R.id.player_x_win);
        scoreView.setText(String.valueOf(msg));
    }


    public void displayForPlayerO(String msg) {
        TextView scoreView = findViewById(R.id.player_o_win);
        scoreView.setText(String.valueOf(msg));
    }

    /**
     * Resets the board and score.
     */
    public void resetGame(View v) {

        scorePlayerX = 0;
        scorePlayerO = 0;

        displayForPlayerXScore(scorePlayerX);
        displayForPlayerOScore(scorePlayerO);

        TextView playerXWin = findViewById(R.id.player_x_win);
        playerXWin.setText(R.string.player_x);

        TextView playerOWin = findViewById(R.id.player_o_win);
        playerOWin.setText(R.string.player_o);

        Button boxOneButton = findViewById(R.id.box_one_view);
        boxOneButton.setText("");

        Button boxTwoButton = findViewById(R.id.box_two_view);
        boxTwoButton.setText("");

        Button boxThreeButton = findViewById(R.id.box_three_view);
        boxThreeButton.setText("");

        Button boxFourButton = findViewById(R.id.box_four_view);
        boxFourButton.setText("");

        Button boxFiveButton = findViewById(R.id.box_five_view);
        boxFiveButton.setText("");

        Button boxSixButton = findViewById(R.id.box_six_view);
        boxSixButton.setText("");

        Button boxSevenButton = findViewById(R.id.box_seven_view);
        boxSevenButton.setText("");

        Button boxEightButton = findViewById(R.id.box_eight_view);
        boxEightButton.setText("");

        Button boxNineButton = findViewById(R.id.box_nine_view);
        boxNineButton.setText("");

        boxOneButton.setEnabled(true);
        boxTwoButton.setEnabled(true);
        boxThreeButton.setEnabled(true);
        boxFourButton.setEnabled(true);
        boxFiveButton.setEnabled(true);
        boxSixButton.setEnabled(true);
        boxSevenButton.setEnabled(true);
        boxEightButton.setEnabled(true);
        boxNineButton.setEnabled(true);

        textOne = "";
        textTwo = "";
        textThree = "";
        textFour = "";
        textFive = "";
        textSix = "";
        textSeven = "";
        textEight = "";
        textNine = "";


    }

    /**
     * Method determining the winning player. The if and else-ifs
     * contain the possible winning combinations.
     */

    public void calculatePlayerScore() {

        scorePlayerX = 0;
        scorePlayerO = 0;

        if (textOne.equals("X") & textTwo.equals("X") & textThree.equals("X")) {

            scorePlayerX = 1;
            scorePlayerO = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerX("Player X Wins!");
            displayForPlayerO("Player O Loses");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textFour.equals("X") & textFive.equals("X") & textSix.equals("X")) {

            scorePlayerX = 1;
            scorePlayerO = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerX("Player X Wins!");
            displayForPlayerO("Player O Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textSeven.equals("X") & textEight.equals("X") & textNine.equals("X")) {

            scorePlayerX = 1;
            scorePlayerO = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerX("Player X Wins!");
            displayForPlayerO("Player O Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textOne.equals("X") & textFour.equals("X") & textSeven.equals("X")) {

            scorePlayerX = 1;
            scorePlayerO = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerX("Player X Wins!");
            displayForPlayerO("Player O Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textTwo.equals("X") & textFive.equals("X") & textEight.equals("X")) {

            scorePlayerX = 1;
            scorePlayerO = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerX("Player X Wins!");
            displayForPlayerO("Player O Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textThree.equals("X") & textSix.equals("X") & textNine.equals("X")) {

            scorePlayerX = 1;
            scorePlayerO = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerX("Player X Wins!");
            displayForPlayerO("Player O Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textOne.equals("X") & textFive.equals("X") & textNine.equals("X")) {

            scorePlayerX = 1;
            scorePlayerO = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerX("Player X Wins!");
            displayForPlayerO("Player O Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textThree.equals("X") & textFive.equals("X") & textSeven.equals("X"))

        {
            scorePlayerX = 1;
            scorePlayerO = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerX("Player X Wins!");
            displayForPlayerO("Player O Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textOne.equals("O") & textTwo.equals("O") & textThree.equals("O")) {

            scorePlayerO = 1;
            scorePlayerX = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerO("Player O Wins!");
            displayForPlayerX("Player X Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textFour.equals("O") & textFive.equals("O") & textSix.equals("O")) {

            scorePlayerO = 1;
            scorePlayerX = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerO("Player O Wins!");
            displayForPlayerX("Player X Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textSeven.equals("O") & textEight.equals("O") & textNine.equals("O")) {

            scorePlayerO = 1;
            scorePlayerX = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerO("Player O Wins!");
            displayForPlayerX("Player X Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textOne.equals("O") & textFour.equals("O") & textSeven.equals("O")) {


            scorePlayerO = 1;
            scorePlayerX = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerO("Player O Wins!");
            displayForPlayerX("Player X Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textTwo.equals("O") & textFive.equals("O") & textEight.equals("O")) {

            scorePlayerO = 1;
            scorePlayerX = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerX("Player O Wins!");
            displayForPlayerO("Player X Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textThree.equals("O") & textSix.equals("O") & textNine.equals("O")) {

            scorePlayerO = 1;
            scorePlayerX = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerO("Player O Wins!");
            displayForPlayerX("Player X Loses!");
            Toast.makeText(this, "GAME OVER! PLEASE RESET BOARD", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textOne.equals("O") & textFive.equals("O") & textNine.equals("O"))

        {
            scorePlayerO = 1;
            scorePlayerX = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerO("Player O Wins!");
            displayForPlayerX("Player X Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else if (textThree.equals("O") & textFive.equals("O") & textSeven.equals("O"))

        {
            scorePlayerO = 1;
            scorePlayerX = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerO("Player O Wins!");
            displayForPlayerX("Player X Loses!");
            Toast.makeText(this, "GAME OVER PLEASE RESET BOARD!", Toast.LENGTH_LONG).show();

            Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setEnabled(false);

            Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setEnabled(false);

            Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setEnabled(false);

            Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setEnabled(false);

            Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setEnabled(false);

            Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setEnabled(false);

            Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setEnabled(false);

            Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setEnabled(false);

            Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setEnabled(false);

        } else {


            scorePlayerO = 0;
            scorePlayerX = 0;
            displayForPlayerXScore(scorePlayerX);
            displayForPlayerOScore(scorePlayerO);
            displayForPlayerO("");
            displayForPlayerX("");

        }

    }


    /**
     * Method called when button 1 is clicked.
     */
    public void boxOne(View v) {

        CheckBox playerXTurnCheckbox = findViewById(R.id.player_x_turn);
        boolean tisplayerXTurn = playerXTurnCheckbox.isChecked();

        CheckBox playerOTurnCheckbox = findViewById(R.id.player_o_turn);
        boolean tisPlayerOTurn = playerOTurnCheckbox.isChecked();

        if (tisplayerXTurn) {

            final Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setText("X");

            textOne = boxOneButton.getText().toString();

        }


        if (tisPlayerOTurn) {

            final Button boxOneButton = findViewById(R.id.box_one_view);
            boxOneButton.setText("O");

            textOne = boxOneButton.getText().toString();

        }

        calculatePlayerScore();

    }


    /**
     * Method called when button 2 is clicked.
     */
    public void boxTwo(View v) {

        CheckBox playerXTurnCheckbox = findViewById(R.id.player_x_turn);
        boolean tisplayerXTurn = playerXTurnCheckbox.isChecked();

        CheckBox playerOTurnCheckbox = findViewById(R.id.player_o_turn);
        boolean tisPlayerOTurn = playerOTurnCheckbox.isChecked();

        if (tisplayerXTurn) {

            final Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setText("X");

            textTwo = boxTwoButton.getText().toString();

        }

        if (tisPlayerOTurn) {

            final Button boxTwoButton = findViewById(R.id.box_two_view);
            boxTwoButton.setText("O");

            textTwo = boxTwoButton.getText().toString();

        }

        calculatePlayerScore();

    }

    /**
     * Method called when button 3 is clicked.
     */
    public void boxThree(View v) {

        CheckBox playerXTurnCheckbox = findViewById(R.id.player_x_turn);
        boolean tisplayerXTurn = playerXTurnCheckbox.isChecked();

        CheckBox playerOTurnCheckbox = findViewById(R.id.player_o_turn);
        boolean tisPlayerOTurn = playerOTurnCheckbox.isChecked();

        if (tisplayerXTurn) {

            final Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setText("X");

            textThree = boxThreeButton.getText().toString();

        }

        if (tisPlayerOTurn) {

            final Button boxThreeButton = findViewById(R.id.box_three_view);
            boxThreeButton.setText("O");

            textThree = boxThreeButton.getText().toString();


        }

        calculatePlayerScore();

    }

    /**
     * Method called when button 4 is clicked.
     */
    public void boxFour(View v) {

        CheckBox playerXTurnCheckbox = findViewById(R.id.player_x_turn);
        boolean tisplayerXTurn = playerXTurnCheckbox.isChecked();

        CheckBox playerOTurnCheckbox = findViewById(R.id.player_o_turn);
        boolean tisPlayerOTurn = playerOTurnCheckbox.isChecked();

        if (tisplayerXTurn) {

            final Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setText("X");

            textFour = boxFourButton.getText().toString();

        }

        if (tisPlayerOTurn) {


            final Button boxFourButton = findViewById(R.id.box_four_view);
            boxFourButton.setText("O");

            textFour = boxFourButton.getText().toString();

        }

        calculatePlayerScore();

    }


    /**
     * Method called when button 5 is clicked.
     */
    public void boxFive(View v) {

        CheckBox playerXTurnCheckbox = findViewById(R.id.player_x_turn);
        boolean tisplayerXTurn = playerXTurnCheckbox.isChecked();

        CheckBox playerOTurnCheckbox = findViewById(R.id.player_o_turn);
        boolean tisPlayerOTurn = playerOTurnCheckbox.isChecked();

        if (tisplayerXTurn) {

            final Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setText("X");

            textFive = boxFiveButton.getText().toString();

        }

        if (tisPlayerOTurn) {

            final Button boxFiveButton = findViewById(R.id.box_five_view);
            boxFiveButton.setText("O");

            textFive = boxFiveButton.getText().toString();

        }

        calculatePlayerScore();
    }

    /**
     * Method called when button 6 is clicked.
     */
    public void boxSix(View v) {

        CheckBox playerXTurnCheckbox = findViewById(R.id.player_x_turn);
        boolean tisplayerXTurn = playerXTurnCheckbox.isChecked();

        CheckBox playerOTurnCheckbox = findViewById(R.id.player_o_turn);
        boolean tisPlayerOTurn = playerOTurnCheckbox.isChecked();

        if (tisplayerXTurn) {


            final Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setText("X");

            textSix = boxSixButton.getText().toString();

        }


        if (tisPlayerOTurn) {

            final Button boxSixButton = findViewById(R.id.box_six_view);
            boxSixButton.setText("O");

            textSix = boxSixButton.getText().toString();

        }

        calculatePlayerScore();
    }

    /**
     * Method called when button 7 is clicked.
     */
    public void boxSeven(View v) {

        CheckBox playerXTurnCheckbox = findViewById(R.id.player_x_turn);
        boolean tisplayerXTurn = playerXTurnCheckbox.isChecked();

        CheckBox playerOTurnCheckbox = findViewById(R.id.player_o_turn);
        boolean tisPlayerOTurn = playerOTurnCheckbox.isChecked();

        if (tisplayerXTurn) {


            final Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setText("X");

            textSeven = boxSevenButton.getText().toString();

        }

        if (tisPlayerOTurn) {

            final Button boxSevenButton = findViewById(R.id.box_seven_view);
            boxSevenButton.setText("O");

            textSeven = boxSevenButton.getText().toString();

        }

        calculatePlayerScore();
    }

    /**
     * Method called when button 8 is clicked.
     */
    public void boxEight(View v) {

        CheckBox playerXTurnCheckbox = findViewById(R.id.player_x_turn);
        boolean tisplayerXTurn = playerXTurnCheckbox.isChecked();

        CheckBox playerOTurnCheckbox = findViewById(R.id.player_o_turn);
        boolean tisPlayerOTurn = playerOTurnCheckbox.isChecked();

        if (tisplayerXTurn) {

            final Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setText("X");

            textEight = boxEightButton.getText().toString();


        }

        if (tisPlayerOTurn) {

            final Button boxEightButton = findViewById(R.id.box_eight_view);
            boxEightButton.setText("O");

            textEight = boxEightButton.getText().toString();

        }

        calculatePlayerScore();
    }

    /**
     * Method called when button 9 is clicked.
     */
    public void boxNine(View v) {

        CheckBox playerXTurnCheckbox = findViewById(R.id.player_x_turn);
        boolean tisplayerXTurn = playerXTurnCheckbox.isChecked();

        CheckBox playerOTurnCheckbox = findViewById(R.id.player_o_turn);
        boolean tisPlayerOTurn = playerOTurnCheckbox.isChecked();

        if (tisplayerXTurn) {

            final Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setText("X");

            textNine = boxNineButton.getText().toString();

        }

        if (tisPlayerOTurn) {

            final Button boxNineButton = findViewById(R.id.box_nine_view);
            boxNineButton.setText("O");

            textNine = boxNineButton.getText().toString();


        }

        calculatePlayerScore();

    }
}




