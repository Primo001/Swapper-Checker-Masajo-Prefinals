package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private TextView resultTextView = findViewById(R.id.resultTextView);;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle extras = getIntent().getExtras();
         if (extras != null) {
            String text1 = extras.getString("text1");
            String text2 = extras.getString("text2");

             //Compare the text values and set the right results
             if (text1.equals(text2)) {
                resultTextView.setText("SAME RESULT");
            } else {
                resultTextView.setText("DIFFERENT");
    }
}}}