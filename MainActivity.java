package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private Button checkButton, swapButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        swapButton = findViewById(R.id.swapButton);
        checkButton = findViewById(R.id.checkButton);

        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                String textholder1 = editText1.getText().toString();
                String textholder2 = editText2.getText().toString();

                editText1.setText(textholder2);
                editText2.setText(textholder1);
            }
        });
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textholder1 = editText1.getText().toString();
                String textholder2 = editText2.getText().toString();

                Intent intent = new Intent(MainActivity.this, Result.class);

                intent.putExtra("text1", textholder1);
                intent.putExtra("text2", textholder2);
                startActivity(intent);
            }
        });


    }
}