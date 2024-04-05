package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class SendTextActivity extends AppCompatActivity {

    private Button btnSend, btnMusicService;
    private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_text);
        init();
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = text.getText().toString();
                Intent intent = new Intent(SendTextActivity.this, GetTextActivity.class);
                intent.putExtra("text", data);
                startActivity(intent);
            }
        });
        btnMusicService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SendTextActivity.this, BackgroundServiceMusicActivity.class));
            }
        });
    }

    private void init() {
        btnSend = findViewById(R.id.btnSend);
        btnMusicService = findViewById(R.id.btnMusicService);
        text = findViewById(R.id.text);
    }
}