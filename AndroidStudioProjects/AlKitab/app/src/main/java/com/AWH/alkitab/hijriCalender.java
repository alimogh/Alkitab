package com.AWH.alkitab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.TextView;

public class hijriCalender extends AppCompatActivity {
    TextView tv = null;
    TextView tv2 = null;
    CalendarView cv = null;
    int year=0;
    int month =0;
    int day = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijri_calender);





        tv = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.convert);


        cv = (CalendarView) findViewById(R.id.calendarView);

        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override

            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                year = i;
                month = i1;
                day= i2;
                tv2.setText(DateHigri.writeIslamicDate1(i,i1,i2));
            }
        });


        tv.setText(("Today:\n"+ DateHigri.writeIslamicDate()));

//        Toast.makeText(this,""+    DateHigri.writeIslamicDate(),Toast.LENGTH_LONG).show();


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}