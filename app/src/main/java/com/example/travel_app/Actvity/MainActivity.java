package com.example.travel_app.Actvity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travel_app.R;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent itent = new Intent(MainActivity.this, StepMainActivity.class);
               startActivity(itent);
           }
       },SPLASH_DISPLAY_LENGTH);
    }
}