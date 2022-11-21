package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_B extends AppCompatActivity {
TextView et_name_b,et_phone_b,et_password_b,et_date_b,et_email_b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        et_name_b = findViewById(R.id.activity_et_name_b);
        et_phone_b= findViewById(R.id.activity_et_pn_b);
        et_password_b= findViewById(R.id.activity_et_ps_b);
        et_date_b= findViewById(R.id.activity_et_dt_b);
        et_email_b= findViewById(R.id.activity_et_em_b);
        Intent a = getIntent();
        String name = a.getStringExtra("user_name");
        et_name_b.setText(name);

        Intent b = getIntent();
        String phone = b.getStringExtra("user_phone");
        et_phone_b.setText(phone);

        Intent c = getIntent();
        String password = c.getStringExtra("user_password");
        et_password_b.setText(password);

        Intent d = getIntent();
        String date = d.getStringExtra("user_date");
       et_date_b.setText(date);

        Intent e = getIntent();
        String email = e.getStringExtra("user_email");
        et_email_b.setText(email);






    }
}