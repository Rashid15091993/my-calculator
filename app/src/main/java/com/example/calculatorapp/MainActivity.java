package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int intValueOne, intValueTwo;
    float floatValueOne, floatValueTwo;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, plus_btn, btnDelete, btnEqual, minus_btn, multiply_btn, divide_btn, pointBtn;
    private TextView inputText;
    boolean cruchifyAddittion, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView inputText = (TextView)findViewById(R.id.editTextNumber);
        Button btn1 = (Button)findViewById(R.id.button1);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);
        Button btn6 = (Button)findViewById(R.id.button6);
        Button btn7 = (Button)findViewById(R.id.button7);
        Button btn8 = (Button)findViewById(R.id.button8);
        Button btn9 = (Button)findViewById(R.id.button9);
        Button btn0 = (Button)findViewById(R.id.button0);

        Button plus_btn = (Button)findViewById(R.id.btnPlus);
        Button minus_btn = (Button)findViewById(R.id.minusBtn);
        Button multiply_btn = (Button)findViewById(R.id.multiplyBtn);
        Button divide_btn = (Button)findViewById(R.id.divideBtn);
        Button pointBtn = (Button)findViewById(R.id.pointBtn);

        Button btnDelete = (Button)findViewById(R.id.delBtn);
        Button btnEqual = (Button)findViewById(R.id.btnEqual);


        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("0")){
                    inputText.setText(null);
                }
                inputText.setText(inputText.getText() + "0");
            }
        });

        pointBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                inputText.setText(inputText.getText() + ".");
            }
        });
        //Delete
        btnDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("")){
                    return;
                }
                else {
                    if (inputText.getText().toString().contains(".")) {
                        inputText.setText("");
                        inputText.setText("0");
                    }
                    else {
                        inputText.setText("");
                        inputText.setText("0");
                    }

                }

            }
        });
        //+
        plus_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("")){
                    return;
                }
                else {
                    if (inputText.getText().toString().contains(".")){
                        floatValueOne = Float.parseFloat(inputText.getText() + "");
                        cruchifyAddittion = true;
                        inputText.setText(null);
                    }
                    else {
                        intValueOne = Integer.parseInt(inputText.getText() + "");
                        cruchifyAddittion = true;
                        inputText.setText(null);

                    }
                }
            }
        });
        // -
        minus_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("")){
                    return;
                }
                else {
                    if (inputText.getText().toString().contains(".")) {
                        floatValueOne = Float.parseFloat(inputText.getText() + "");
                        mSubtract = true;
                        inputText.setText(null);
                    }
                    else {
                        intValueOne = Integer.parseInt(inputText.getText() + "");
                        mSubtract = true;
                        inputText.setText(null);
                    }
                }
            }
        });
        //  divide /
        divide_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("")){
                    return;
                }
                else {
                    if (inputText.getText().toString().contains(".")){
                        floatValueOne = Float.parseFloat(inputText.getText() + "");
                        crunchifyDivision = true;
                        inputText.setText(null);
                    }
                    else {
                        intValueOne = Integer.parseInt(inputText.getText() + "");
                        crunchifyDivision = true;
                        inputText.setText(null);
                    }
                }
            }
        });
        // *
        multiply_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("")){
                    return;
                }
                else {
                    if (inputText.getText().toString().contains(".")){

                        floatValueOne = Float.parseFloat(inputText.getText() + "");
                        crunchifyMultiplication = true;
                        inputText.setText(null);
                    }

                    else {

                        intValueOne = Integer.parseInt(inputText.getText() + "");
                        crunchifyMultiplication = true;
                        inputText.setText(null);

                    }
                }
            }
        });
        // =
        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (inputText.getText().toString().equals("")){
                    return;
                }
                //float
                else{
                    floatValueTwo = Float.parseFloat(inputText.getText() + "");
                    if (inputText.getText().toString().contains(".")) {
                        if (cruchifyAddittion == true) {
                            inputText.setText(floatValueOne + floatValueTwo + "");
                            cruchifyAddittion = false;
                        }

                        if (mSubtract == true) {
                            inputText.setText(floatValueOne - floatValueTwo + "");
                            mSubtract = false;
                        }


                        if (crunchifyMultiplication == true) {
                            inputText.setText(floatValueOne * floatValueTwo + "");
                            crunchifyMultiplication = false;
                        }

                        if (crunchifyDivision == true) {
                            inputText.setText(floatValueOne / floatValueTwo + "");
                            crunchifyDivision = false;
                        }
                    }
                    //int
                    else{
                        intValueTwo = Integer.parseInt(inputText.getText() + "");
                        if (cruchifyAddittion == true) {
                            inputText.setText(intValueOne + intValueTwo + "");
                            cruchifyAddittion = false;
                        }

                        if (mSubtract == true) {
                            inputText.setText(intValueOne - intValueTwo + "");
                            mSubtract = false;
                        }


                        if (crunchifyMultiplication == true) {
                            inputText.setText(intValueOne * intValueTwo + "");
                            crunchifyMultiplication = false;
                        }

                        if (crunchifyDivision == true) {
                            inputText.setText(intValueOne / intValueTwo + "");
                            crunchifyDivision = false;
                        }
                    }
                }
            }
        });

    }
}