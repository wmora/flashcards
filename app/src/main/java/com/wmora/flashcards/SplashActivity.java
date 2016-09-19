package com.wmora.flashcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Scheduler scheduler = new Scheduler(this);
        scheduler.setUpAlarms();
    }
}
