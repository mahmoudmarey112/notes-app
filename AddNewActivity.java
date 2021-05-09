package com.marey.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AddNewActivity extends AppCompatActivity {

    ImageButton btn_back;
    ImageButton btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openHomePage();}
        });
    }

    private void openHomePage() {
        Intent intent = new Intent(AddNewActivity.this, MainActivity.class);
        startActivity(intent);
    }
}