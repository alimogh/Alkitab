package com.AWH.alkitab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bottomNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);


        BottomNavigationView bottomNavigationView = findViewById(R.id.main_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListner);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new HomeFragment()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {

                case R.id.nav_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.nav_learn:
                    selectedFragment = new LearnFragment();
                    break;
                case R.id.nav_evaluate:
                    selectedFragment = new EvaluateFragment();
                    break;
                case R.id.nav_extra:
                    selectedFragment = new ExtraFragment();
                    break;
                case R.id.nav_about:
                    selectedFragment = new ProfileFragment();
                    break;


            }


            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, selectedFragment).commit();
            return true;


        }

    };
}