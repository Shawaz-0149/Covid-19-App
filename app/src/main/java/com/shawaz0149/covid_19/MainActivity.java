package com.shawaz0149.covid_19;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start;
        start=findViewById(R.id.start);
        start.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Home.class);
            startActivity(intent);
        });
    }
}