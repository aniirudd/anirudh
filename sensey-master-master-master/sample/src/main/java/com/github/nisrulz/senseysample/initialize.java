package com.github.nisrulz.senseysample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class initialize extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=2300;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initialize);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent nonu=new Intent(initialize.this, Main2Activity.class);
                startActivity(nonu);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
