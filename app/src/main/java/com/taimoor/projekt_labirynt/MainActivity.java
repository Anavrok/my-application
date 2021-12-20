package com.taimoor.projekt_labirynt;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        // button_narzedzia start
        Button button_narzedzia = findViewById(R.id.button_narzedzia);
        button_narzedzia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, narzedzia.class);
                startActivity(intent);
            }
        });
        // button_narzedzia end

        // button_graj start
        Button button_graj = findViewById(R.id.button_graj);
        button_graj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, graj.class);
                startActivity(intent);
            }
        });
        // button_graj end



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState == null) {
            getFragmentManager().beginTransaction().replace(R.id.fragment_container, new mainfragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new mainfragment()).commit();
                break;
            case R.id.nav_start:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new startfragment()).commit();
                break;
            case R.id.nav_config:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new configfragment()).commit();
                break;
            case R.id.nav_profile:
                profilefragment_act();
                break;
            case R.id.nav_login:
                loginfragment_act();
                break;
            case R.id.nav_share:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    public void loginfragment_act(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void profilefragment_act(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }



}