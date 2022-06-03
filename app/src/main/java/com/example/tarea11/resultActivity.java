package com.example.tarea11;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class resultActivity extends AppCompatActivity {

    private TextView finalAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        finalAnswer = (TextView)findViewById(R.id.txt_answer);
        String result = getIntent().getStringExtra("result").toString();
        finalAnswer.setText(result);
    }

    public void Back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}