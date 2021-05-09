package com.marey.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NotesActivity extends AppCompatActivity {

    ImageButton btn_back;
    ImageButton btn_secret;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomePage();
            }
        });

        btn_secret = findViewById(R.id.btn_sec);
        btn_secret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPassPage();
            }
        });

    }

    private void openPassPage() {
        Intent intent = new Intent(NotesActivity.this, PassActivity.class);
        startActivity(intent);
    }

    private void openHomePage() {
        Intent intent = new Intent(NotesActivity.this, MainActivity.class);
        startActivity(intent);
    }
}