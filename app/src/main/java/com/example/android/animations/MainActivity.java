package com.example.android.animations;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentPractice()).commit();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment selectedFragment = null;

                switch(menuItem.getItemId()){
                    case R.id.nav_lesson:
                        selectedFragment  = new FragmentLessons();
                        break;
                    case R.id.nav_allLessons:
                        selectedFragment  = new FragmentAllLessons();
                        break;
                    case R.id.nav_progress:
                        selectedFragment  = new FragmentProgress();
                        break;
                    case R.id.nav_practice:
                        selectedFragment  = new FragmentPractice();
                        break;
                    case R.id.nav_premium:
                        selectedFragment  = new FragmentPremium();
                        break;



                        }

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        return true;
            }
        });
}

}
