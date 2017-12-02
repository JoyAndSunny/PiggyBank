package com.example.jowon.piggybank;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        TextView mytext= findViewById(R.id.myTextview);
        RelativeLayout mylayout = findViewById(R.id.mylayout);
        mylayout.setBackgroundColor(Color.RED);

    }
}
