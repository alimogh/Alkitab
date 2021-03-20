package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class Qibla extends AppCompatActivity implements SensorEventListener {

    private TextView txtDegrees;
    private ImageView imgCompass;
    private float currentDegree=0f;
    private SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qibla);

        imgCompass=(ImageView)findViewById(R.id.ic_compass);
        txtDegrees=(TextView)findViewById(R.id.textView2);
        sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);
    }

    @Override
    protected void onResume()
    {
// TODO: Implement this method
        super.onResume();
        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION),SensorManager.SENSOR_DELAY_GAME);
    }

    @Override
    protected void onPause()
    {
// TODO: Implement this method
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float degree=Math.round(event.values[0]);

        /////
        degree += 110;
        /////
        txtDegrees.setText("Rotation: "+Float.toString(degree)+" degrees");

        RotateAnimation ra=new RotateAnimation(currentDegree,-degree, Animation.RELATIVE_TO_SELF,0.5f,
                Animation.RELATIVE_TO_SELF,0.5f);

        /*RotateAnimation ra=new RotateAnimation(currentDegree,-degree,Animation.RELATIVE_TO_SELF,0.5f,
                Animation.RELATIVE_TO_SELF,0.5f);*/

        //ra.setDuration(1000);
        ra.setDuration(120);
        ra.setFillAfter(true);
        imgCompass.startAnimation(ra);
        currentDegree=-degree;

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

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