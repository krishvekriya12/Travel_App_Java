package com.example.travel_app.Actvity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travel_app.R;

public class StepMainActivity extends AppCompatActivity {
    private Button btnstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_main);
        btnstart = findViewById(R.id.btnstart);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StepMainActivity.this, Log_Sign_Activity.class);
                startActivity(intent);
            }
        });
    }
}