package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantityriver = 0;
    int quantityboca = 0;
    int quantityfaltariver = 0;
    int quantityfaltaboca = 0;
    int quantitycartoesriver = 0;
    int quantitycartoesboca = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gol_river(View view) {
        quantityriver = quantityriver + 1;
        displayRiverScore(quantityriver);
    }

    public void faltas_river(View view) {
        quantityfaltariver = quantityfaltariver + 1;
        displayRiverFaltas(quantityfaltariver);
    }

    public void cartoes_river(View view) {
        quantitycartoesriver = quantitycartoesriver + 1;
        displayRiverCartoes(quantitycartoesriver);
    }

    public void gol_boca(View view) {
        quantityboca = quantityboca + 1;
        displayBocaScore(quantityboca);
    }

    public void faltas_boca(View view) {
        quantityfaltaboca = quantityfaltaboca + 1;
        displayBocaFaltas(quantityfaltaboca);
    }

    public void cartoes_boca(View view) {
        quantitycartoesboca = quantitycartoesboca + 1;
        displayBocaCartoes(quantitycartoesboca);
    }

    public void reset(View view) {
        quantityriver = 0;
        quantityboca = 0;
        quantityfaltariver = 0;
        quantityfaltaboca = 0;
        quantitycartoesriver = 0;
        quantitycartoesboca = 0;
        displayBocaScore(quantityboca);
        displayRiverScore(quantityriver);
        displayBocaFaltas(quantityfaltaboca);
        displayRiverFaltas(quantityfaltariver);
        displayBocaCartoes(quantitycartoesboca);
        displayRiverCartoes(quantitycartoesriver);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayRiverScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.river_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBocaScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.boca_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRiverFaltas(int score) {
        TextView scoreView = (TextView) findViewById(R.id.river_faltas);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBocaFaltas(int score) {
        TextView scoreView = (TextView) findViewById(R.id.boca_faltas);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRiverCartoes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.river_cartoes);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBocaCartoes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.boca_cartoes);
        scoreView.setText(String.valueOf(score));
    }

    private class MyAppCompatActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    }
}