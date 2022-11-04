package com.example.w02p02;

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

        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch (id) {
                    case R.id.button01:
                        ile++;
                        break;
                    case R.id.button02:
                        ile--;
                        break;
                    case R.id.textView01: ile=0; break;
                }
                licznik.setText(String.valueOf(ile));
            }
        };

        p1.setOnClickListener(sluchacz);
        p2.setOnClickListener(sluchacz);
        licznik.setOnClickListener(sluchacz);
    }
}