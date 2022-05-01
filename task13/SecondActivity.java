package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final  String TAG = "2nd Activity hai";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); //xml binding
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