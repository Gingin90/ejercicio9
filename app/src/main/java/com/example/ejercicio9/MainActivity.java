package com.example.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    int imagen1 = R.drawable.ic_launcher_foreground;
    int imagen2 = R.drawable.ic_launcher_foreground;
    int imagen3 = R.drawable.ic_launcher_foreground;
    int imagen4 = R.drawable.ic_launcher_foreground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }


    private void initListeners() {

        ImageButton boton1 = findViewById(R.id.button1);
        ImageButton boton2 = findViewById(R.id.button2);
        ImageButton boton3 = findViewById(R.id.button3);
        ImageButton boton4 = findViewById(R.id.button4);
        Button botonsalir = findViewById(R.id.buttonExit);



        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen1);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen2);

            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen3);

            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen4);
            }

        });

        botonsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);
            }
        });

    }
    private void moveToSecondActivity(int imagen) {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra( "Clave",imagen);
        startActivity(intent);

    }
}










