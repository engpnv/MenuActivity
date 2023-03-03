package com.example.menuactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DadosPessoais extends AppCompatActivity {

    EditText et_nome, et_sobrenome, et_dt;
    Button bt_salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dados_pessoais);

        et_nome = findViewById(R.id.et_nome);
        et_sobrenome = findViewById(R.id.et_sobrenome);
        et_dt = findViewById(R.id.et_dt);
        bt_salvar = findViewById(R.id.bt_salvar);
        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DadosPessoais.this, ResultadoDP.class);
                intent.putExtra("nome", et_nome.getText().toString());
                intent.putExtra("sobrenome", et_sobrenome.getText().toString());
                intent.putExtra("dt", et_dt.getText().toString());
                startActivity(intent);

            }
        });
    }


}