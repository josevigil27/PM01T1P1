package com.josev.pm01t1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.verify.domain.DomainVerificationUserState;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);

        Button btnsuma = (Button) findViewById(R.id.btnsuma);
        Button btnresta = (Button) findViewById(R.id.btnresta);
        Button btnmultiplicacion = (Button) findViewById(R.id.btnmultiplicacion);
        Button btndivision = (Button) findViewById(R.id.btndivision);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View contendor = view.getRootView();

                Intent intent = new Intent(getApplicationContext(), ActivityResult.class);
                intent.putExtra("num1", txtnum1.getText().toString());
                intent.putExtra("num2", txtnum2.getText().toString());
                startActivity(intent);

                // Double resultado;

                // resultado = Double.parseDouble(txtnum1.getText().toString()) + Double.parseDouble(txtnum2.getText().toString());
                // Toast.makeText(getApplicationContext(), resultado.toString(), Toast.LENGTH_LONG).show();
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View contenedor = view.getRootView();

                Intent intent = new Intent(getApplicationContext(), ActivityResult2.class);
                intent.putExtra("num1", txtnum1.getText().toString());
                intent.putExtra("num2", txtnum2.getText().toString());
                startActivity(intent);

                // Double resultado;

                // resultado = Double.parseDouble(txtnum1.getText().toString()) - Double.parseDouble(txtnum2.getText().toString());
                // Toast.makeText(getApplicationContext(), resultado.toString(), Toast.LENGTH_LONG).show();
            }
        });

        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View contenedor = view.getRootView();

                Intent intent = new Intent(getApplicationContext(), ActivityResult3.class);
                intent.putExtra("num1", txtnum1.getText().toString());
                intent.putExtra("num2", txtnum2.getText().toString());
                startActivity(intent);

                // Double resultado;

                // resultado = Double.parseDouble(txtnum1.getText().toString()) * Double.parseDouble(txtnum2.getText().toString());
                // Toast.makeText(getApplicationContext(), resultado.toString(), Toast.LENGTH_LONG).show();
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View contendor = view.getRootView();

                Intent intent = new Intent(getApplicationContext(), ActivityResult4.class);
                intent.putExtra("num1", txtnum1.getText().toString());
                intent.putExtra("num2", txtnum2.getText().toString());
                startActivity(intent);

                // Double resultado;

                // resultado = Double.parseDouble(txtnum1.getText().toString()) / Double.parseDouble(txtnum2.getText().toString());
                // Toast.makeText(getApplicationContext(), resultado.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}