package com.example.menuactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Contato extends AppCompatActivity {

    EditText et_telefone, et_email;
    Button bt_salvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contato);

        et_telefone = findViewById(R.id.et_telefone);
        et_email = findViewById(R.id.et_email);
        bt_salvar = findViewById(R.id.bt_salvar);

        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Contato.this, ResultadoContato.class);
                intent.putExtra("email", et_email.getText().toString());
                intent.putExtra("telefone", et_telefone.getText().toString());
                startActivity(intent);
            }
        });
    }
}
