package com.dev.jm.pointsercice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BaterPontoActivity extends AppCompatActivity {

        Button btFoto;
        Button btEnviar;
        Button btVoltar;
       // ImageView imgFoto;
        ImageView imgLogo;
        TextView tvData;
        TextView tvHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bater_ponto);

        btFoto = (Button) findViewById(R.id.btFoto);
        btEnviar = (Button) findViewById(R.id.btEnviar);
        btVoltar = (Button) findViewById(R.id.btVoltar);
       // imgFoto = (ImageView) findViewById(R.id.imgFoto);
        imgLogo = (ImageView) findViewById(R.id.imgLogo);
        tvData = (TextView) findViewById(R.id.tvData);
        tvHora = (TextView) findViewById(R.id.tvHora);

        Calendar c = Calendar.getInstance();
        //System.out.println("Current time => "+c.getTime());

        SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = data.format(c.getTime());
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
        String formattedHora = hora.format(c.getTime());

        //Toast.makeText(this, formattedDate, Toast.LENGTH_SHORT).show();

        tvData.setText(formattedDate);
        tvData.setTextSize(30);
        tvHora.setText(formattedHora);
        tvHora.setTextSize(30);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BaterPontoActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}