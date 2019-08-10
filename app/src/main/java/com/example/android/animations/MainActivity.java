package com.example.android.animations;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("");

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentLessons()).commit();



        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.hamburgerToolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.hamburger_nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) { // hamburger menu
        Fragment selectedFragment = null;
        switch (menuItem.getItemId()){



            case R.id.ham_lesson:
                selectedFragment  = new FragmentLessons();
                break;
            case R.id.ham_allLessons:
                selectedFragment  = new FragmentAllLessons();
                break;
            case R.id.ham_progress:
                selectedFragment  = new FragmentProgress();
                break;
            case R.id.ham_practice:
                selectedFragment  = new FragmentPractice();
                break;
            case R.id.ham_premium:
                selectedFragment  = new FragmentPremium();
                break;


        }


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        else
        {
            super.onBackPressed();
        }
    }
}
