package com.dev.jm.pointsercice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdmActivity extends AppCompatActivity {

    Button btCadusuario;
    Button btCadJustificativa;
    Button btCadNotificacao;
    Button btJustiPendentes;
    Button btVoltar;
    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm);

        btCadusuario = (Button) findViewById(R.id.btCadUsuario);
        btCadNotificacao = (Button) findViewById(R.id.btCadNotificacao);
        btCadJustificativa = (Button) findViewById(R.id.btCadJustificativa);
        btJustiPendentes = (Button) findViewById(R.id.btJustPendentes);
        btVoltar = (Button) findViewById(R.id.btVoltar);


        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdmActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        btCadusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdmActivity.this, CadUsuarioActivity.class);
                startActivity(i);
            }
        });

    }
}