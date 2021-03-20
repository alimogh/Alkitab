package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Introduction_Tajweed extends AppCompatActivity {

    TextView txtTajweed;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction__tajweed);

        txtTajweed = (TextView) findViewById(R.id.textView7);
        txtTajweed.setText("Tajweed means to make beauty in reading.\n" +
                "\n" +
                "It means to pronounce every letter correctly with all its qualities\n" +
                "\n" +
                "\n" +
                "Almighty Allah Says in the Holy Quran that::\n" +
                "\n" +
                "\"Recite hte Holy Quran slowly and making the letters clear\"\n" +
                "\n" +
                "\n" +
                "BEAUTY OF THE HOLY QURAN\n" +
                "\n" +
                "\n" +
                "Saying of the Holy Prophet (P.B.U.H) :\n" +
                "\n" +
                "Beautify the Holy Quran with your voices, definitely beautiful voices enhance the beauty of the Holy Quran");
    }
}