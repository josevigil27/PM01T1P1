package com.josev.pm01t1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult4 extends AppCompatActivity {

    TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result4);

        txtresultado = (TextView) findViewById(R.id.txtresultado4);

        String txtnum1 = getIntent().getStringExtra("num1");
        String txtnum2 = getIntent().getStringExtra("num2");

        Double resultadoDivision;
        resultadoDivision = Double.parseDouble(txtnum1) / Double.parseDouble(txtnum2);
        txtresultado.setText(resultadoDivision.toString());

    }
}