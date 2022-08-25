package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MoreScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_screen);

        //Receives the intent to complete the screen switch
        Intent intent = getIntent();
    }

    //This method finds the the value of num1 raised to the power of num2
    public void findPow(View view) {

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
            int ans = (int)Math.pow(num1, num2);

            answerDisplay.setText("" + ans);
        }catch(Exception e){
            answerDisplay.setText("ERROR");
        }

    }

    //This method finds the square root of num 1
    public void findSqrt(View view) {

        EditText number1 = findViewById(R.id.enterNum1);
        TextView answerDisplay = findViewById(R.id.answer);

        try {
            //How to hide the keyboard programically from a Stack Overflow Post
            //https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

            double num1 = Integer.parseInt((number1.getText().toString()));
            double ans = Math.sqrt(num1);

            answerDisplay.setText("" + ans);
        }catch(Exception e){
            answerDisplay.setText("ERROR");
        }

    }

    //Clears the two input text boxes when a button is pressed
    public void clearButton(View view){
        EditText num1 = findViewById(R.id.enterNum1);
        EditText num2 = findViewById(R.id.enterNum2);
        TextView ans = findViewById(R.id.answer);

        ans.setText("");
        num1.setText("");
        num2.setText("");
    }
}