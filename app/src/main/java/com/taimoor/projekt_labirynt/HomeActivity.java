package com.taimoor.projekt_labirynt;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        Button button_powrot = findViewById(R.id.button_powrot);
        button_powrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final TextView email = findViewById(R.id.emailId);
        final TextView fullname = findViewById(R.id.fullName);
        final ImageView photo = findViewById(R.id.picture);
        final AppCompatButton signOutBtn = findViewById(R.id.signOutBtn);

        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        GoogleSignInClient googleSignInClient = GoogleSignIn.getClient(this, googleSignInOptions);

        GoogleSignInAccount googleSignInAccount = GoogleSignIn.getLastSignedInAccount(this);

        final String getFullName = googleSignInAccount.getDisplayName();
        final String getEmail = googleSignInAccount.getEmail();
        final Uri getPhotoUrl = googleSignInAccount.getPhotoUrl();


        photo.setImageURI(getPhotoUrl);
        email.setText("Email : "+getEmail);
        fullname.setText("FullName : "+getFullName);
        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                googleSignInClient.signOut();

                startActivity(new Intent(HomeActivity.this, Login.class));
                finish();
            }
        });
    }
}