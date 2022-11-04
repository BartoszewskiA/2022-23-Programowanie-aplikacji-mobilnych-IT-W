package com.example.w02p03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView licznik;
    SeekBar suwak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        licznik = findViewById(R.id.textView01);
        suwak = findViewById(R.id.seekBar01);

        suwak.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //licznik.setText(String.valueOf(suwak.getProgress()));
               licznik.setText(String.valueOf(progress));
                Toast.makeText(MainActivity.this, String.valueOf(progress), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
               // Toast.makeText(MainActivity.this, "START", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //licznik.setText(String.valueOf(suwak.getProgress()));
                //Toast.makeText(MainActivity.this, "STOP", Toast.LENGTH_SHORT).show();
            }
        });
    }
}