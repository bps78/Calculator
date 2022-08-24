package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //These 4 arithmetic methods are based on the addition one from the notes

    //This method finds the sum of entered numbers when the + button is pressed
    public void findSum(View view) {

            EditText number1 = findViewById(R.id.enterNum1);
            EditText number2 = findViewById(R.id.enterNum2);
            TextView answerDisplay = findViewById(R.id.answer);

            try {
                //How to hide the keyboard programically from a Stack Overflow Post
                //https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

                int num1 = Integer.parseInt((number1.getText().toString()));
                int num2 = Integer.parseInt((number2.getText().toString()));
                int sum = num1 + num2;
                answerDisplay.setText("" + sum);
            }catch (Exception e){
                answerDisplay.setText("ERROR");
            }

    }

    //This method finds the difference of entered numbers when the - button is pressed
    public void findDif(View view) {

            EditText number1 = findViewById(R.id.enterNum1);
            EditText number2 = findViewById(R.id.enterNum2);
            TextView answerDisplay = findViewById(R.id.answer);

            try {
                //How to hide the keyboard programically from a Stack Overflow Post
                //https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

                int num1 = Integer.parseInt((number1.getText().toString()));
                int num2 = Integer.parseInt((number2.getText().toString()));
                int dif = num1 - num2;

                answerDisplay.setText("" + dif);
            }catch (Exception e){
                answerDisplay.setText("ERROR");
            }

    }

    //This method finds the product of entered numbers when the * button is pressed
    public void findProd(View view) {

            EditText number1 = findViewById(R.id.enterNum1);
            EditText number2 = findViewById(R.id.enterNum2);
            TextView answerDisplay = findViewById(R.id.answer);

            try {
                //How to hide the keyboard programically from a Stack Overflow Post
                //https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

                int num1 = Integer.parseInt((number1.getText().toString()));
                int num2 = Integer.parseInt((number2.getText().toString()));
                int prod = num1 * num2;

                answerDisplay.setText("" + prod);
            }catch(Exception e){
                answerDisplay.setText("ERROR");
            }

    }

    //This method finds the quotient of entered numbers when the / button is pressed
    public void findDiv(View view) {

            EditText number1 = findViewById(R.id.enterNum1);
            EditText number2 = findViewById(R.id.enterNum2);
            TextView answerDisplay = findViewById(R.id.answer);

            try {
                //How to hide the keyboard programically from a Stack Overflow Post
                //https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

                double num1 = Integer.parseInt((number1.getText().toString()));
                double num2 = Integer.parseInt((number2.getText().toString()));
                double div = num1 / num2;

                answerDisplay.setText("" + div);
            }catch(Exception e){
                answerDisplay.setText("ERROR");
            }

    }


    //Begins the switch to the "more" screen when the more button is clicked
    public void moreButton(View view){
        Intent intent = new Intent(this, MoreScreen.class);
        startActivity(intent);
    }


}