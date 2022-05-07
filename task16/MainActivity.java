package com.example.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edittxt =(EditText) findViewById(R.id.urltext);
        Button btn = (Button) findViewById(R.id.navigatorbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = edittxt.getText().toString();
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        Button btnsend = (Button)findViewById(R.id.emailbtn);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent si = new Intent(Intent.ACTION_SEND);
                si.setType("text/plain");
                si.putExtra(Intent.EXTRA_EMAIL, new String[] {"fajarqadir49@pucit.edu.pk"});
                si.putExtra(Intent.EXTRA_SUBJECT , "welcome note");
                si.putExtra(Intent.EXTRA_TEXT, "hi guest, WELCOME TO MY TUTORIAL SITE");
                startActivity(Intent.createChooser(si,"choose mail app"));
            }
        });
    }
}