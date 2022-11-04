package com.example.w02p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView licznik;
    Button p1,p2;
    int ile=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        licznik = findViewById(R.id.textView01);
        p1 = findViewById(R.id.button01);
        p2 = findViewById(R.id.button02);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ile++;
                licznik.setText(String.valueOf(ile));
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ile--;
                licznik.setText(String.valueOf(ile));
            }
        });
        licznik.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ile=0;
                licznik.setText(String.valueOf(ile));
                return false;
            }
        });
    }
}