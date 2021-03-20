package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Etiquettes_Tajweed extends AppCompatActivity {

    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etiquettes__tajweed);

        textView = (TextView) findViewById(R.id.txtView);
        textView.setText("To Make a Wadu/Perform ablution first because Allah loves those who clean themselves\n" +
                "To sit properly / with great respect\n" +
                "Not to talk or play while reading Lesson/Quran.\n" +
                "Before the Recitation of the Holy Quran it is necessary to say:\n" +
                "أعوذباللهمنالشيطانالرجيم\n" +
                "\n" +
                "بسماللهالرحمنالرحيم");
    }
}