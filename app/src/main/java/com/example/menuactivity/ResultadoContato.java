package com.example.menuactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoContato extends AppCompatActivity {
    TextView tv_resultado;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_dp);

        tv_resultado = findViewById(R.id.tv_resultado);
        intent = getIntent();

        String email = intent.getExtras().getString("email");
        String telefone = intent.getExtras().getString("telefone");
        tv_resultado.setText("Telefone: "+telefone+" E-mail: "+email);
    }
}