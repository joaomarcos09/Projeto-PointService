package com.dev.jm.pointsercice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btAdm;
    Button btBaterPonto;
    Button btJustificar;
    ImageView imgLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAdm = (Button) findViewById(R.id.btAdm);
        btJustificar = (Button) findViewById(R.id.btJustificar);
        btBaterPonto = (Button) findViewById(R.id.btBaterPonto);
        imgLogo = (ImageView) findViewById(R.id.imgLogo);

        btAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AdmActivity.class);
                startActivity(i);
            }
        });
        btBaterPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BaterPontoActivity.class);
                startActivity(i);
            }
        });
        btJustificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, JustificativaActivity.class);
                startActivity(i);
            }
        });
    }
}