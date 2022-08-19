package com.example.calculator;

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

    //This method finds the sum of entered numbers when the + button is pressed
    public void findSum(View view) {
        EditText number1 = findViewById(R.id.enterNum1);
        EditText number2 = findViewById(R.id.enterNum2);
        TextView answerDisplay = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1.getText().toString()));
        int num2 = Integer.parseInt((number2.getText().toString()));
        int sum = num1 + num2;

        answerDisplay.setText("" + sum);
    }

    //This method finds the difference of entered numbers when the - button is pressed
    public void findDif(View view) {
        EditText number1 = findViewById(R.id.enterNum1);
        EditText number2 = findViewById(R.id.enterNum2);
        TextView answerDisplay = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1.getText().toString()));
        int num2 = Integer.parseInt((number2.getText().toString()));
        int sum = num1 - num2;

        answerDisplay.setText("" + sum);
    }

    //This method finds the product of entered numbers when the * button is pressed
    public void findProd(View view) {
        EditText number1 = findViewById(R.id.enterNum1);
        EditText number2 = findViewById(R.id.enterNum2);
        TextView answerDisplay = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1.getText().toString()));
        int num2 = Integer.parseInt((number2.getText().toString()));
        int sum = num1 * num2;

        answerDisplay.setText("" + sum);
    }

    //This method finds the quotient of entered numbers when the / button is pressed
    public void findDiv(View view) {
        EditText number1 = findViewById(R.id.enterNum1);
        EditText number2 = findViewById(R.id.enterNum2);
        TextView answerDisplay = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1.getText().toString()));
        int num2 = Integer.parseInt((number2.getText().toString()));
        int sum = num1 / num2;

        answerDisplay.setText("" + sum);
    }


}