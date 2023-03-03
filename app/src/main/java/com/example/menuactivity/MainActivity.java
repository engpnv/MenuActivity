package com.example.menuactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button bt_dadosPessoais;
    Button bt_endereco;
    Button bt_contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_dadosPessoais = findViewById(R.id.bt_dadosPessoais);
        bt_endereco = findViewById(R.id.bt_endereco);
        bt_contato = findViewById(R.id.bt_contato);

        bt_dadosPessoais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mudarAtividade = new Intent(MainActivity.this, DadosPessoais.class);
                startActivity(mudarAtividade);
            }
        });

        bt_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mudarAtividade = new Intent(MainActivity.this, Contato.class);
                startActivity(mudarAtividade);
            }
        });
        bt_endereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mudarAtividade = new Intent(MainActivity.this, Endereco.class);
                startActivity(mudarAtividade);
            }
        });
    }
}