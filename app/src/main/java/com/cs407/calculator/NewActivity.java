package com.cs407.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        textView=(TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message");
        textView.setText("Result "+str);
    }
}

