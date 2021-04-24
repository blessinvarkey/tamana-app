package com.example.enablingthedisabled;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThingsToTry extends AppCompatActivity implements View.OnClickListener {

    private TextView  scorePlayerOne, scorePlayerTwo, playerStatus;
    private Button[] buttons = new Button[9];
    private Button resetGame;

    private int playerOneScoreCount, playerTwoScoreCount, roundCount;
    boolean activePlayer;
    //Player 1 =0
    // Player 2 = 1
    // Empty state =2
    int [] gamestate = {2,2,2,2,2,2,2,2,2};
    int [][] winningPositions = {
            {1,2,3},{4,5,6},{7,8,9}, //rows
            {1,4,7},{2,5,8},{3,6,9},// columns
            {1,5,9},{3,5,7}//diagonal

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_try);
        scorePlayerOne = (TextView) findViewById(R.id.scorePlayerOne);
        scorePlayerTwo = (TextView) findViewById(R.id.scorePlayerTwo);
        playerStatus = (TextView) findViewById(R.id.playerStatus);

        resetGame = (Button) findViewById(R.id.reset);
        for(int i=0; i< buttons.length;i++){
            String buttonID = "btn_" +i;
            int resourceID = getResources().getIdentifier(buttonID, "id", getPackageName());
            buttons[i] = (Button) findViewById(resourceID);
            buttons[i].setOnClickListener(this);
        }
    };

    @Override
    public void onClick(View v) {
        Log.i("test", "button is clicked");
    }
}