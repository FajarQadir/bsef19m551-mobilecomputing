package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final  String TAG = "MainActivity ye hy";
    Button mbuttonview , mbuttoncounter;
    TextView mtextview ;
    private int counter= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, ":::this is my onCreate:::");
        mbuttonview =findViewById(R.id.b1);
        mbuttoncounter =findViewById(R.id.b2);
        mtextview = findViewById(R.id.t2);
        mbuttonview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("counter", counter);

                startActivity(i);
            }
        });
        mbuttoncounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++counter;
                mtextview.setText("Total "+ counter);
            }
        });
        if(savedInstanceState !=null)
        {
            String count = savedInstanceState.getString("count");
            if(mtextview !=null)
            {
                mtextview.setText(count);
            }

        }

    }
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putString("count", String.valueOf(mtextview.getText()));
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