package com.marey.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecretsActivity extends AppCompatActivity {

    ImageButton btn_back;
    ImageButton btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secrets);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotesPage();
            }
        });

        btn_add = findViewById(R.id.img_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openAddNewPage(); }
        });
    }

    private void openAddNewPage() {
        Intent intent = new Intent(SecretsActivity.this, AddNewActivity.class);
        startActivity(intent);
    }

    private void openNotesPage() {
        Intent intent = new Intent(SecretsActivity.this, NotesActivity.class);
        startActivity(intent);
    }


}