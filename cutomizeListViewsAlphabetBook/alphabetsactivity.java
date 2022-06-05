package com.alphabetsapp.listviewalphabeticbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class alphabetsactivity extends AppCompatActivity {
    ListView simpleList;

    String alphabetsList[] = {"a", "b", "c", "d", "e", "f","g","h", "i", "j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_alphabetsactivity, R.id.textView1, alphabetsList);
        simpleList.setAdapter(arrayAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              //  Log.d("you clicked", alphabetsList.get(i));

                Intent in = new Intent(alphabetsactivity.this, alphabetdetails.class);

                //in.putExtra("alphabets" , alphabetsList.get(i));

                startActivity(in);




                }


            }
        );
    }
}