package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alphabetsactivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsactivity);
        Button btn = (Button) findViewById(R.id.a);
        btn.setOnClickListener(this);
        Button btn1 = (Button) findViewById(R.id.b);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.c);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.d);
        btn3.setOnClickListener(this);
        Button btn4 = (Button) findViewById(R.id.e);
        btn4.setOnClickListener(this);
        Button btn5 = (Button) findViewById(R.id.f);
        btn5.setOnClickListener(this);
        Button btn6 = (Button) findViewById(R.id.g);
        btn6.setOnClickListener(this);
        Button btn7 = (Button) findViewById(R.id.h);
        btn7.setOnClickListener(this);
        Button btn8 = (Button) findViewById(R.id.i);
        btn8.setOnClickListener(this);
        Button btn9 = (Button) findViewById(R.id.j);
        btn9.setOnClickListener(this);
        Button btn10 = (Button) findViewById(R.id.k);
        btn10.setOnClickListener(this);
        Button btn11 = (Button) findViewById(R.id.l);
        btn11.setOnClickListener(this);
        Button btn12 = (Button) findViewById(R.id.m);
        btn12.setOnClickListener(this);
        Button btn13 = (Button) findViewById(R.id.n);
        btn13.setOnClickListener(this);
        Button btn14 = (Button) findViewById(R.id.o);
        btn14.setOnClickListener(this);
        Button btn15 = (Button) findViewById(R.id.p);
        btn15.setOnClickListener(this);
        Button btn16 = (Button) findViewById(R.id.q);
        btn16.setOnClickListener(this);
        Button btn17 = (Button) findViewById(R.id.r);
        btn17.setOnClickListener(this);
        Button btn18 = (Button) findViewById(R.id.s);
        btn18.setOnClickListener(this);
        Button btn19 = (Button) findViewById(R.id.t);
        btn19.setOnClickListener(this);
        Button btn20 = (Button) findViewById(R.id.u);
        btn20.setOnClickListener(this);
        Button btn21 = (Button) findViewById(R.id.v);
        btn21.setOnClickListener(this);
        Button btn22 = (Button) findViewById(R.id.w);
        btn22.setOnClickListener(this);
        Button btn23 = (Button) findViewById(R.id.x);
        btn23.setOnClickListener(this);
        Button btn24 = (Button) findViewById(R.id.y);
        btn24.setOnClickListener(this);
        Button btn25 = (Button) findViewById(R.id.z);
        btn25.setOnClickListener(this);


        
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(alphabetsactivity.this, alphabetdetails.class);
        switch (view.getId()){
            case R.id.a:
            {
                intent.putExtra("alphabets", "a");
                startActivity(intent);
                break;

            }
            case R.id.b:
            {
                intent.putExtra("alphabets", "b");
                startActivity(intent);
                break;

            }
            case R.id.c:
            {
                intent.putExtra("alphabets", "c");
                startActivity(intent);
                break;

            }
            case R.id.d:
            {
                intent.putExtra("alphabets", "d");
                startActivity(intent);
                break;

            }
            case R.id.e:
            {
                intent.putExtra("alphabets", "e");
                startActivity(intent);
                break;

            }
            case R.id.f:
            {
                intent.putExtra("alphabets", "f");
                startActivity(intent);
                break;

            }
            case R.id.g:
            {
                intent.putExtra("alphabets", "g");
                startActivity(intent);
                break;

            }
            case R.id.h:
            {
                intent.putExtra("alphabets", "h");
                startActivity(intent);
                break;

            }
            case R.id.i:
            {
                intent.putExtra("alphabets", "i");
                startActivity(intent);
                break;

            }
            case R.id.j:
            {
                intent.putExtra("alphabets", "j");
                startActivity(intent);
                break;

            }
            case R.id.k:
            {
                intent.putExtra("alphabets", "k");
                startActivity(intent);
                break;

            }
            case R.id.l:
            {
                intent.putExtra("alphabets", "l");
                startActivity(intent);
                break;

            }
            case R.id.m:
            {
                intent.putExtra("alphabets", "m");
                startActivity(intent);
                break;

            }
            case R.id.n:
            {
                intent.putExtra("alphabets", "n");
                startActivity(intent);
                break;

            }
            case R.id.o:
            {
                intent.putExtra("alphabets", "o");
                startActivity(intent);
                break;

            }
            case R.id.p:
            {
                intent.putExtra("alphabets", "p");
                startActivity(intent);
                break;

            }
            case R.id.q:
            {
                intent.putExtra("alphabets", "q");
                startActivity(intent);
                break;

            }
            case R.id.r:
            {
                intent.putExtra("alphabets", "r");
                startActivity(intent);
                break;

            }
            case R.id.s:
            {
                intent.putExtra("alphabets", "s");
                startActivity(intent);
                break;

            }
            case R.id.t:
            {
                intent.putExtra("alphabets", "t");
                startActivity(intent);
                break;

            }
            case R.id.u:
            {
                intent.putExtra("alphabets", "u");
                startActivity(intent);
                break;

            }
            case R.id.v:
            {
                intent.putExtra("alphabets", "v");
                startActivity(intent);
                break;

            }
            case R.id.w:
            {
                intent.putExtra("alphabets", "w");
                startActivity(intent);
                break;

            }
            case R.id.x:
            {
                intent.putExtra("alphabets", "x");
                startActivity(intent);
                break;

            }
            case R.id.y:
            {
                intent.putExtra("alphabets", "y");
                startActivity(intent);
                break;

            }
            case R.id.z:
            {
                intent.putExtra("alphabets", "z");
                startActivity(intent);
                break;

            }
        }

    }
}