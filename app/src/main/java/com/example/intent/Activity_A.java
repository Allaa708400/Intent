package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_A extends AppCompatActivity {
Button btn_save;
EditText et_name_a,et_phone_a,et_password_a,et_date_a,et_email_a;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        btn_save = findViewById(R.id.activity_btn_save);
        et_name_a = findViewById(R.id.activity_et_name_a);
        et_phone_a= findViewById(R.id.activity_et_pn_a);
        et_password_a= findViewById(R.id.activity_et_ps_a);
        et_date_a= findViewById(R.id.activity_et_dt_a);
        et_email_a= findViewById(R.id.activity_et_em_a);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Activity_B.class);
                intent.putExtra("user_name", et_name_a.getText().toString());
                intent.putExtra("user_phone", et_phone_a.getText().toString());
                intent.putExtra("user_password", et_password_a.getText().toString());
                intent.putExtra("user_date", et_date_a.getText().toString());
                intent.putExtra("user_email", et_email_a.getText().toString());
                startActivity(intent);
            }
        });
    }
}