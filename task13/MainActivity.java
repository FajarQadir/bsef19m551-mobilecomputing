package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final  String TAG = "MainActivity ye hy";
    Button mbuttonview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, ":::this is my onCreate:::");
        mbuttonview =findViewById(R.id.b1);
        mbuttonview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });

    }
    protected void onStart(){
        super.onStart();
        Log.d(TAG, ":::this is my onStart:::");

    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, ":::this is my onDestroy:::");

    }
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, ":::this is my onRestart:::");

    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG, ":::this is my onStop:::");

    }
    protected void onResume(){
        super.onResume();
        Log.d(TAG, ":::this is my onResume:::");

    }
    protected void onPause(){
        super.onPause();
        Log.d(TAG, ":::this is my onPause:b ::");

    }
}