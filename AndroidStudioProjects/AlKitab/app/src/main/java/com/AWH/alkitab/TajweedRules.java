package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class TajweedRules extends AppCompatActivity {

    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajweed_rules);


        initializeCards();
        callCards();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    public void initializeCards() {



        c1 = (CardView) findViewById(R.id.c1);
        c2 = (CardView) findViewById(R.id.c2);
        c3 = (CardView) findViewById(R.id.c3);
        c4 = (CardView) findViewById(R.id.c4);
        c5 = (CardView) findViewById(R.id.c5);
        c6 = (CardView) findViewById(R.id.c6);
        c7 = (CardView) findViewById(R.id.c7);
        c8 = (CardView) findViewById(R.id.c8);
        c9 = (CardView) findViewById(R.id.c9);
        c10 = (CardView) findViewById(R.id.c10);
        c11 = (CardView) findViewById(R.id.c11);
        c13 = (CardView) findViewById(R.id.c13);
        c14 = (CardView) findViewById(R.id.c14);
        c15 = (CardView) findViewById(R.id.c15);
        c16 = (CardView) findViewById(R.id.c16);
        c17 = (CardView) findViewById(R.id.c17);
        c18 = (CardView) findViewById(R.id.c18);
        c19 = (CardView) findViewById(R.id.c19);
        c20 = (CardView) findViewById(R.id.c20);


    }
    public void callCards() {

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,Introduction_Tajweed.class);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,Etiquettes_Tajweed.class);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,Arabic_Alphabets_Tajweed.class);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,Recognizing_The_Dots_Tajweed.class);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,Pronunciation_of_Letters_Tajweed.class);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,Similar_Sound_Letters_Tajweed.class);
                startActivity(intent);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,Bold_Sound_Letters_Tajweed.class);
                startActivity(intent);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,tajweed_throatLetters.class);
                startActivity(intent);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,tajweed_movements.class);
                startActivity(intent);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,tajweed_Jazm.class);
                startActivity(intent);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,tajweed_standing_fathaha.class);
                startActivity(intent);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,maddah_letters_tajweed.class);
                startActivity(intent);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,leen_letters_tajweed.class);
                startActivity(intent);
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,hamza_tajweed.class);
                startActivity(intent);
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,shadd_tajweed.class);
                startActivity(intent);
            }
        });
        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,ghunnah_tajweed.class);
                startActivity(intent);
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,qalkalah_tajweed.class);
                startActivity(intent);
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajweedRules.this,silent_letters_tajweed.class);
                startActivity(intent);
            }
        });
    }
}