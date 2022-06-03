package com.example.tarea11;

import android.content.Intent;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.txt_num1);
        num2 = (EditText)findViewById(R.id.txt_num2);
    }

    public void Suma(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        int total = Integer.parseInt(valor1) + Integer.parseInt(valor2);

        String result = String.valueOf(total);

        Intent newView = new Intent(this, resultActivity.class);
        newView.putExtra("result", result);
        startActivity(newView);
    }

    public void Resta(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        int total = Integer.parseInt(valor1) - Integer.parseInt(valor2);

        String result = String.valueOf(total);

        Intent newView = new Intent(this, resultActivity.class);
        newView.putExtra("result", result);
        startActivity(newView);
    }

    public void Multiplicar(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        int total = Integer.parseInt(valor1) * Integer.parseInt(valor2);

        String result = String.valueOf(total);

        Intent newView = new Intent(this, resultActivity.class);
        newView.putExtra("result", result);
        startActivity(newView);
    }

    public void Dividir(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        double total = Double.parseDouble(valor1) / Double.parseDouble(valor2);

        String result = String.valueOf(total);

        Intent newView = new Intent(this, resultActivity.class);
        newView.putExtra("result", result);
        startActivity(newView);
    }
}