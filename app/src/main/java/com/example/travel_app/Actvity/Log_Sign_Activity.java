package com.example.travel_app.Actvity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travel_app.R;
import com.google.android.material.button.MaterialButton;

public class Log_Sign_Activity extends AppCompatActivity {

    private MaterialButton btnlogin,btnsigin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lo_sign);

        btnlogin = findViewById(R.id.btnlogin);
        btnsigin = findViewById(R.id.btnsigin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Log_Sign_Activity.this, Login_Activity.class);
                startActivity(intent);
            }
        });
        btnsigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Log_Sign_Activity.this, Signin_Activity.class);
                startActivity(intent);
            }
        });

    }
}
