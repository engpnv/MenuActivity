package com.example.menuactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Endereco extends AppCompatActivity {
    EditText et_rua, et_numero, et_cep;
    Button bt_salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.endereco);

        et_rua = findViewById(R.id.et_rua);
        et_numero = findViewById(R.id.et_numero);
        et_cep = findViewById(R.id.et_cep);
        bt_salvar = findViewById(R.id.bt_salvar);
        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Endereco.this, ResultadoEndereco.class);
                intent.putExtra("rua", et_rua.getText().toString());
                intent.putExtra("numero", et_numero.getText().toString());
                intent.putExtra("cep", et_cep.getText().toString());
                startActivity(intent);
            }
        });
    }
}
