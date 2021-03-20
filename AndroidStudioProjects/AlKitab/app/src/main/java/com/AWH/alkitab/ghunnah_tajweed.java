package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ghunnah_tajweed extends AppCompatActivity {
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghunnah_tajweed);

        txt1 = (TextView) findViewById(R.id.text1);
        String shadd = "Keep the Sound in Nose Whenever a Noon or Meem appears with a Shadda, it will be pronounced with a Gunnah.";

        txt1.setText(shadd);
    }
}