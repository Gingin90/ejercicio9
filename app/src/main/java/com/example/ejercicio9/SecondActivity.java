package com.example.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initListeners();
        Intent intentGet = getIntent();
        int idImage = intentGet.getIntExtra("Clave", 0);
        Log.d("Second Activity", String.valueOf(idImage));

        ImageView imageButton = findViewById(R.id.imageView);
        imageButton.setImageResource(idImage);
    }

    private void initListeners() {
        Button botonBack = findViewById(R.id.buttonBack);
        botonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}