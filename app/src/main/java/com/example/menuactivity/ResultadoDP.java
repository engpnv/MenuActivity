package com.example.menuactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoDP extends AppCompatActivity {
    TextView tv_resultado;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_dp);

        tv_resultado = findViewById(R.id.tv_resultado);
        intent = getIntent();

        String nome = intent.getExtras().getString("nome");
        String sobrenome = intent.getExtras().getString("sobrenome");
        String dt = intent.getExtras().getString("dt");
        tv_resultado.setText("nome: "+nome+" "+sobrenome+" nascido em: "+dt);

    }
}
