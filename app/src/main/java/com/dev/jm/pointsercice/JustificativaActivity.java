package com.dev.jm.pointsercice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JustificativaActivity extends AppCompatActivity {
        Button btEnviar;
        Button btAnxFoto;
        Button btVoltar;
        EditText etMensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justificativa);

        btAnxFoto = (Button) findViewById(R.id.btAnxFoto);
        btEnviar = (Button) findViewById(R.id.btEnviar);
        etMensagem = (EditText) findViewById(R.id.etMensagem);
        btVoltar = (Button) findViewById(R.id.btVoltar);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(JustificativaActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}