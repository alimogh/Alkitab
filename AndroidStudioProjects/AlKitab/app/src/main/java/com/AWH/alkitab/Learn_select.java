package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Learn_select extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_select);




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

    private  void initializeCards(){
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
        c12 = (CardView) findViewById(R.id.c12);
        c13 = (CardView) findViewById(R.id.c13);
        c14 = (CardView) findViewById(R.id.c14);
        c15 = (CardView) findViewById(R.id.c15);

    }

    private void callCards() {

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(1);

            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(2);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(3);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(4);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(5);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(6);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(7);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(8);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(9);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(10);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(11);
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(12);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(13);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(14);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qariAccent(15);
            }
        });
    }

    private void qariAccent(int no){
        Intent intent = new Intent(Learn_select.this, qari_selection.class);
        intent.putExtra("chapterNo",no);
        startActivity(intent);

    }
}