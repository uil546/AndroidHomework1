package com.yourname.androidhomework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonLogin = findViewById(R.id.button_login);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"网络不佳，请检查您的网络设置。",Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonRegister = findViewById(R.id.button_register);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        Button buttonExRegister1 = findViewById(R.id.button_extraLogin1);
        buttonExRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"网络不佳，请检查您的网络设置。",Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonExRegister2 = findViewById(R.id.button_extraLogin2);
        buttonExRegister2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"网络不佳，请检查您的网络设置。",Toast.LENGTH_SHORT).show();
            }
        });
    }
}