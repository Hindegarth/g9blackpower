package com.example.abrahamzacarias.cambiapantalla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button botonvolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        botonvolver = (Button)findViewById(R.id.buttonprimera);
        botonvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonvolver = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(botonvolver);
            }
        });
    }
}

