package br.com.pedrazzani.android.basketcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamA_score = 0;
    private int teamB_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button3PontosOnClickTeamA(View view) {
        teamA_score += 3;
        atualizaViewTeamA();
    }

    public void button3PontosOnClickTeamB(View view) {
        teamB_score += 3;
        atualizaViewTeamB();
    }

    public void button2PontosOnClickTeamA(View view) {
        teamA_score += 2;
        atualizaViewTeamA();
    }

    public void button2PontosOnClickTeamB(View view) {
        teamB_score += 2;
        atualizaViewTeamB();
    }

    public void button1PontosOnClickTeamA(View view) {
        teamA_score += 1;
        atualizaViewTeamA();
    }

    public void button1PontosOnClickTeamB(View view) {
        teamB_score += 1;
        atualizaViewTeamB();
    }

    private void atualizaViewTeamA() {
        TextView view = (TextView) findViewById(R.id.score_teamA);
        view.setText(String.valueOf(teamA_score));
    }

    private void atualizaViewTeamB() {
        TextView view = (TextView) findViewById(R.id.score_teamB);
        view.setText(String.valueOf(teamB_score));
    }


    public void buttonReset(View v){
        teamB_score = teamA_score = 0;
        atualizaViewTeamA();
        atualizaViewTeamB();
    }


}