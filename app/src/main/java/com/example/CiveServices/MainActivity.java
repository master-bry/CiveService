package com.example.CiveServices;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.startbtn);
        stop = findViewById(R.id.stopbtn);

        start.setOnClickListener(v -> {
          Intent intent = new Intent(MainActivity.this, MyService.class);
          startService(intent);
        });
        stop.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MyService.class);
            stopService(intent);
        });
        }

    }

