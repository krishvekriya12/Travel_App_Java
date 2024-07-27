package com.example.travel_app.Actvity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.travel_app.R;
import com.google.android.material.button.MaterialButton;

public class Signin_Activity extends AppCompatActivity {
    private ImageView btn_sign_back;
    private MaterialButton sign_tohome;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
       btn_sign_back = findViewById(R.id.btn_sign_back);
        sign_tohome = findViewById(R.id.sign_tohome);
       btn_sign_back.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Signin_Activity.this, Log_Sign_Activity.class);
               startActivity(intent);
           }
       });
        sign_tohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signin_Activity.this, Home_Activity.class);
                startActivity(intent);
            }
        });
    }
}