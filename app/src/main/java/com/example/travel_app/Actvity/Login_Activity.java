package com.example.travel_app.Actvity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.travel_app.R;
import com.google.android.material.button.MaterialButton;

public class Login_Activity extends AppCompatActivity {

    private ImageView btn_login_back;
    private MaterialButton login_tosign,login_tohome;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        btn_login_back = findViewById(R.id.btn_login_back);
        login_tosign = findViewById(R.id.login_tosign);
        login_tohome = findViewById(R.id.login_tohome);

        btn_login_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this, Log_Sign_Activity.class);
                startActivity(intent);
            }
        });
        login_tosign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this, Signin_Activity.class);
                startActivity(intent);
            }
        });
        login_tohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this, Home_Activity.class);
                startActivity(intent);
            }
        });

    }
}