package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Qari_chapter3 extends AppCompatActivity implements View.OnClickListener {

    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;

    int [] img = {  R.drawable.c1,R.drawable.c2,R.drawable.c3,
            R.drawable.c4,R.drawable.c5,R.drawable.c6,
            R.drawable.c7,R.drawable.c8,R.drawable.c9,
            R.drawable.c10,R.drawable.c11,R.drawable.c12,
            R.drawable.c13,R.drawable.c14};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qari_chapter3);


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

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
        c10.setOnClickListener(this);
        c11.setOnClickListener(this);
        c12.setOnClickListener(this);
        c13.setOnClickListener(this);
        c14.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.c1:
                next(0);
                break;
            case R.id.c2:
                next(1);
                break;
            case R.id.c3:
                next(2);
                break;

            case R.id.c4:
                next(3);
                break;
            case R.id.c5:
                next(4);
                break;
            case R.id.c6:
                next(5);
                break;
            case R.id.c7:
                next(6);
                break;
            case R.id.c8:
                next(7);
                break;
            case R.id.c9:
                next(8);
                break;
            case R.id.c10:
                next(9);
                break;
            case R.id.c11:
                next(10);
                break;
            case R.id.c12:
                next(11);
                break;
            case R.id.c13:
                next(12);
                break;
            default:
                next(29);
                break;
        }

    }
    public void next(int i){
        Intent intent = new Intent(Qari_chapter3.this,Record.class);
        intent.putExtra("img",img[i]);
        intent.putExtra("filenumber",i+1);
        intent.putExtra("chapter","Chapter 3");
        startActivity(intent);
    }
}