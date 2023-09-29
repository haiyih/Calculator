package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        int val1 = Integer.valueOf(myTextField.getText().toString());
        int val2 = Integer.valueOf(myTextField2.getText().toString());
        int val3 = val1 +val2;
        goToActivity(String.valueOf(val3));
    }
    public void Subtraction(View view){
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        int val1 = Integer.valueOf(myTextField.getText().toString());
        int val2 = Integer.valueOf(myTextField2.getText().toString());
        int val3 = val1-val2;
        goToActivity(String.valueOf(val3));
    }
    public void Multiplication(View view){
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        int val1 = Integer.valueOf(myTextField.getText().toString());
        int val2 = Integer.valueOf(myTextField2.getText().toString());
        int val3 = val1*val2;
        goToActivity(String.valueOf(val3));
    }
    public void Division(View view) {
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        double val1 = Integer.valueOf(myTextField.getText().toString());
        double val2 = Integer.valueOf(myTextField2.getText().toString());
        if (val2 == 0) {
            Toast.makeText(this, "We cannot divide anything by zero", Toast.LENGTH_SHORT).show();
            return;
        }
        double val3 = val1 / val2;


        goToActivity(String.valueOf(val3));
    }
    public void goToActivity(String s) {
        Intent intent=new Intent(this,NewActivity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}