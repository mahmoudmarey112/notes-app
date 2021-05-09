package com.marey.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_view;
    private Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_view = findViewById(R.id.btn_view);
        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityNotes();
            }
        });


        btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddNewActivity();
            }
        });

    }

    private void openAddNewActivity() {
        Intent intent = new Intent(MainActivity.this, AddNewActivity.class);
        startActivity(intent);
    }

    private void openActivityNotes() {
        Intent intent = new Intent(MainActivity.this, NotesActivity.class);
        startActivity(intent);
    }
}