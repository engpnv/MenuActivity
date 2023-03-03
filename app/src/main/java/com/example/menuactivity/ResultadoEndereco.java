package com.example.menuactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoEndereco extends AppCompatActivity {
    TextView tv_resultado;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_dp);

        tv_resultado = findViewById(R.id.tv_resultado);
        intent = getIntent();

        String rua = intent.getExtras().getString("rua");
        String numero = intent.getExtras().getString("numero");
        String cep = intent.getExtras().getString("cep");
        tv_resultado.setText("rua: "+rua+" número: "+numero+" CEP: "+cep);
    }
}