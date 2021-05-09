package com.marey.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PassActivity extends AppCompatActivity {

    ImageButton btn_back;
    Button btn_enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotesPage();
            }
        });

        btn_enter = findViewById(R.id.btn_enter);
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecretsPage();
            }
        });

    }

    private void openSecretsPage() {
        Intent intent = new Intent(PassActivity.this, SecretsActivity.class);
        startActivity(intent);
    }

    private void openNotesPage() {
        Intent intent = new Intent(PassActivity.this, NotesActivity.class);
        startActivity(intent);
    }
}