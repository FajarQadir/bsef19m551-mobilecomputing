package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final  String TAG = "MainActivity ye hy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, ":::this is my onCreate:::");

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