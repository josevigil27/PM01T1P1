package com.josev.pm01t1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityResult extends AppCompatActivity {

    TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtresultado = (TextView) findViewById(R.id.txtresultado);

        String txtnum1 = getIntent().getStringExtra("num1");
        String txtnum2 = getIntent().getStringExtra("num2");

        Double resultadoSuma;

        resultadoSuma = Double.parseDouble(txtnum1) + Double.parseDouble(txtnum2);
        txtresultado.setText(resultadoSuma.toString());

    }
}