package com.example.w02p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rb_1, rb_2, rb_3;
    TextView opis1,opis2,opis3,opis4;
    CheckBox checkBox01;
    RatingBar ratinBar01;
    Spinner spinner01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dodajSluchaczaRadioButtonow();
        dodajSluchaczCheckBox();
        dodajSluchaczRatinBar();
        dodajSluchaczSpinnera();
    }

    private void dodajSluchaczSpinnera() {
        opis4 = findViewById(R.id.textView04);
        spinner01 = findViewById(R.id.spinner01);

        spinner01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                opis4.setText("Wybrano pozycję: "+(position+1));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void dodajSluchaczRatinBar() {
        ratinBar01 = findViewById(R.id.ratingBar01);
        opis3 = findViewById(R.id.textView03);
        ratinBar01.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                opis3.setText("Ocena: "+ rating);
            }
        });
    }

    private void dodajSluchaczCheckBox() {
        opis2 = findViewById(R.id.textView02);
        checkBox01 = findViewById(R.id.checkBox01);
        checkBox01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox01.isChecked())
                    opis2.setText("WYbrano TAK");
                else
                    opis2.setText("WYbrano NIE");

            }
        });

    }

    private void dodajSluchaczaRadioButtonow() {
        opis1 = findViewById(R.id.textView01);
        rb_1 = findViewById(R.id.radioButton01);
        rb_2 = findViewById(R.id.radioButton02);
        rb_3 = findViewById(R.id.radioButton03);

        View.OnClickListener sluchaczRB = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
  /*              int id = v.getId();
                switch (id)
                {
                    case R.id.radioButton01: opis1.setText("WYbrano opcję 1");break;
                    case R.id.radioButton02: opis1.setText("WYbrano opcję 2");break;
                    case R.id.radioButton03: opis1.setText("WYbrano opcję 3");break;
                }*/
                if(rb_1.isChecked())
                    opis1.setText("WYbrano opcję 1");
                else if(rb_2.isChecked())
                    opis1.setText("WYbrano opcję 2");
                else
                    opis1.setText("WYbrano opcję 3");
            }
        };
        rb_1.setOnClickListener(sluchaczRB);
        rb_2.setOnClickListener(sluchaczRB);
        rb_3.setOnClickListener(sluchaczRB);
    }

}