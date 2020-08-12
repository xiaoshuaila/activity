package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DatailActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datail1);
        Button button=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        Log.i("生命周期","onCreate()2方法调用");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DatailActivity1.this,MainActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("生命周期","onStart()2方法调用");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("生命周期", "onRestart()2方法调用");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("生命周期","onStop()2方法调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("生命周期","onDestroy()2方法调用");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("生命周期","onPause()2方法调用");
    }
}