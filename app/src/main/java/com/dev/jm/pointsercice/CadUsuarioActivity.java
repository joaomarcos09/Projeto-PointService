package com.dev.jm.pointsercice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadUsuarioActivity extends AppCompatActivity {
    EditText etNome;
    EditText etCpf;
    EditText etDataNasc;
    EditText etSenha;
    EditText etConfSenha;
    Button btVoltar;
    Button btCadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_usuario);

        etNome = (EditText) findViewById(R.id.etNome);
        etCpf = (EditText) findViewById(R.id.etCpf);
        etDataNasc = (EditText) findViewById(R.id.etDataNasc);
        etSenha = (EditText) findViewById(R.id.etSenha);
        etConfSenha = (EditText) findViewById(R.id.etConfSenha);
        btVoltar = (Button) findViewById(R.id.btVoltar);
        btCadastrar = (Button) findViewById(R.id.btCadastrar);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CadUsuarioActivity.this, AdmActivity.class);
                startActivity(i);
            }
        });

    }
}