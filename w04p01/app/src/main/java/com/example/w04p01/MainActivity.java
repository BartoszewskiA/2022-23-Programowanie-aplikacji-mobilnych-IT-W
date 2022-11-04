package com.example.w04p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView ramka;
    Button przycisk;
    TextView opis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ramka = findViewById(R.id.ramka);
        przycisk = findViewById(R.id.przycisk);
        opis = findViewById(R.id.opis);
        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ramka.setImageResource(R.drawable.image02);
           /* String s = getResources().getString(R.string.opis02);
            opis.setText(s);*/
                opis.setText(getResources().getString(R.string.opis02));
            }
        });
    }
}