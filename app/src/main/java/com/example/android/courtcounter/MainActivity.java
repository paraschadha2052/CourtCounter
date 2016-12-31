package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0, scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayA();
        displayB();
    }

    public void threeA(View view){
        scoreA += 3;
        displayA();
    }

    public void twoA(View view){
        scoreA += 2;
        displayA();
    }

    public void freeA(View view){
        scoreA += 1;
        displayA();
    }

    public void displayA(){
        TextView t = (TextView) findViewById(R.id.txt1);
        t.setText("" + scoreA);
    }

    public void threeB(View view){
        scoreB += 3;
        displayB();
    }

    public void twoB(View view){
        scoreB += 2;
        displayB();
    }

    public void freeB(View view){
        scoreB += 1;
        displayB();
    }

    public void displayB(){
        TextView t = (TextView) findViewById(R.id.txt2);
        t.setText("" + scoreB);
    }

}
