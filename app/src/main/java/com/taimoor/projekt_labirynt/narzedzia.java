package com.taimoor.projekt_labirynt;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class narzedzia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_narzedzia);

        // 1 button start
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(narzedzia.this, Barometr.class);
                startActivity(intent);
            }
        });
        // 1 button end

        // 2 button start
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(narzedzia.this, Jasnosc.class);
                startActivity(intent);
            }
        });
        // 2 button end

        // 3 button start
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(narzedzia.this, Kompas.class);
                startActivity(intent);
            }
        });
        // 3 button end

        // 4 button start
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(narzedzia.this, Natezenie.class);
                startActivity(intent);
            }
        });
        // 4button end

        // 5 button start
        Button button5 = findViewById(R.id.Button_logowanie);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(narzedzia.this, Login.class);
                startActivity(intent);
            }
        });
        // 5 button end

        // 6 button start
        Button button6 = findViewById(R.id.button_mapa);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(narzedzia.this, Mapa.class);
                startActivity(intent);
            }
        });
        // 6 button end

        // 7 button_powrot start
        Button button_powrot = findViewById(R.id.button_powrot);
        button_powrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(narzedzia.this, MainActivity.class);
                startActivity(intent);
            }
        });
        // 7 button_powrot end




    }
}