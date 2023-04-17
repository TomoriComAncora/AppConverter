package com.example.dolaremreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converter(View view) {

        EditText editDolar, editCotacao;
        TextView textResult;

        editDolar = findViewById(R.id.editDolar);
        editCotacao = findViewById(R.id.editCotacao);
        textResult = findViewById(R.id.textResult);

        double valorDolar = Double.parseDouble(editDolar.getText().toString());
        double valorCotacao = Double.parseDouble(editCotacao.getText().toString());
        double valorEmReal = valorDolar * valorCotacao;

        textResult.setText("Valor em Reais R$: " + valorEmReal);

    }
}