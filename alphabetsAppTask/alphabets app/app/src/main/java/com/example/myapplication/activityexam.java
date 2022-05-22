package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class activityexam extends AppCompatActivity implements View.OnClickListener {

    TextView mt1 , mt2 ;
    RadioButton btn, btn1 , btn2, btn3 , btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityexam);
         btn = (RadioButton) findViewById(R.id.m1r1);
        btn.setOnClickListener(this);
        btn1 = (RadioButton) findViewById(R.id.m1r2);
        btn1.setOnClickListener(this);
        btn2 = (RadioButton) findViewById(R.id.m1r3);
        btn2.setOnClickListener(this);
        mt1 = findViewById(R.id.t1);
        mt2= findViewById(R.id.t2);
        btn3 = (RadioButton) findViewById(R.id.m2r1);
        btn3.setOnClickListener(this);
        btn4 = (RadioButton) findViewById(R.id.m2r2);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(btn.isChecked())
        {
            mt1.setText("Wrong");
        }
        if(btn1.isChecked())
        {
            mt1.setText("Wrong");
        }
        if(btn2.isChecked())
        {
            mt1.setText("Correct");
        }
        if(btn3.isChecked())
        {
            mt2.setText("Correct");
        }
        if(btn4.isChecked())
        {
            mt2.setText("Wrong");
        }

    }
}