package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class qalkalah_tajweed extends AppCompatActivity {
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qalkalah_tajweed);
        txt1 = (TextView) findViewById(R.id.text1);
        String shadd = "Jerking Sound\n" +
                "\n" +
                "When any Qalkal Letter is sakin then such, MuteSakin Letter should be recited with repeated voice.\n" +
                "\n" +
                "The Letters of Qalkalah are five.";

        txt1.setText(shadd);
    }
}