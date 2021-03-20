package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class shadd_tajweed extends AppCompatActivity {
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shadd_tajweed);

        txt1 = (TextView) findViewById(R.id.text1);
        String shadd = "A letter with shadd is called Mushadad.\n" +
                "\n" +
                "This letter is read twice with one movement of the tongue.\n" +
                "\n" +
                "It is read by joining the first letter into the Second ,\n" +
                "\n" +
                "Reading the first with a sukoon (jazam) and the second one with a harkat.";

        txt1.setText(shadd);
    }
}