package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("生命周期","onCreate()方法调用");
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, DatailActivity1.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("生命周期","onStart()方法调用");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("生命周期", "onRestart()方法调用");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("生命周期","onStop()方法调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("生命周期","onDestroy()方法调用");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("生命周期","onPause()方法调用");
    }
}