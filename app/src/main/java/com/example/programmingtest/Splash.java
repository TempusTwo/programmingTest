package com.example.programmingtest;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;


public class Splash extends AppCompatActivity {

    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launchscreen);


        timer = new Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {
                timer.cancel();
                intentConnect();
            }
        };

        timer.schedule(myTask, 2000);

    }

    private void intentConnect(){
        Intent i = new Intent(Splash.this, MainActivity.class);
        startActivity(i);
    }
}