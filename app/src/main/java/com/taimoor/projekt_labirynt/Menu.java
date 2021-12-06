package com.taimoor.projekt_labirynt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_menu);
        /*
        // button_narzedzia start
        Button button_narzedzia = findViewById(R.id.button_narzedzia);
        button_narzedzia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, narzedzia.class);
                startActivity(intent);
            }
        });
        // button_narzedzia end

        // button_graj start
        Button button_graj = findViewById(R.id.button_graj);
        button_graj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, graj.class);
                startActivity(intent);
            }
        });
        // button_graj end
        */
    }



}