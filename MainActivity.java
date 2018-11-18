package com.example.abrahamzacarias.cambiapantalla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button botonsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonsiguiente = (Button)findViewById(R.id.buttonsegunda);
        botonsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonsiguiente = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(botonsiguiente);
            }
        });
    }
}
