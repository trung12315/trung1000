package com.rajendra.foodapp;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class DangNhap extends AppCompatActivity {
    Button bt_signup;
    Button bt_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dangnhap);

        bt_signup=(Button)findViewById(R.id.btnDongYDN);
        bt_signin=(Button)findViewById(R.id.btnDangKyDN);
        bt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();

            }
        });
        bt_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfiler();

            }
        });


    }
    public void openProfile() {
        Intent intent = new Intent(DangNhap.this, trangchu.class);
        startActivity(intent);

    }

    public void openProfiler() {
        Intent i = new Intent(DangNhap.this, DangKy.class);
        startActivity(i);

    }
}

