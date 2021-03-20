package com.AWH.alkitab;

import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

public class SharedPref extends AppCompatActivity {

    public void setData(){


        SharedPreferences.Editor editor = getSharedPreferences("SharedData", 0).edit();
        editor.putString("name", "Elena");
        editor.putInt("idName", 12);
        editor.apply();


    }
    public void getData(){
        SharedPreferences prefs = getSharedPreferences("SharedData", 0);
        String name = prefs.getString("name", "No name defined");//"No name defined" is the default value.
        int idName = prefs.getInt("idName", 0); //0 is the default value.


        System.out.println("---------------------------Name------------"+name);
        System.out.println("---------------------------Id------------"+idName);
    }



}
