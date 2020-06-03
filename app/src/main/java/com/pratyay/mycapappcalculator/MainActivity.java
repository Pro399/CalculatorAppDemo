package com.pratyay.mycapappcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;

    Button add,subtract,multiply,divide;

    Button reset,equal;
//    ImageButton clear;

    TextView data,answer;
    int firstNumber,secondNumber,number=0;
    String operation="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data=findViewById(R.id.data);
        answer=findViewById(R.id.answer);

        num1=findViewById(R.id.number1);
        num2=findViewById(R.id.number2);
        num3=findViewById(R.id.number3);
        num4=findViewById(R.id.number4);
        num5=findViewById(R.id.number5);
        num6=findViewById(R.id.number6);
        num7=findViewById(R.id.number7);
        num8=findViewById(R.id.number8);
        num9=findViewById(R.id.number9);
        num0=findViewById(R.id.number0);

        add=findViewById(R.id.add);
        subtract=findViewById(R.id.subtract);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);

        equal=findViewById(R.id.equal);

        reset=findViewById(R.id.reset);
//        clear=findViewById(R.id.clear);


        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+1;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+2;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+3;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+4;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+5;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+6;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+7;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+8;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+9;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number*10+0;
                if(operation.equals("")) {
                    data.setText(String.valueOf(number));
                }else {
                    data.setText(String.valueOf(firstNumber)+operation+String.valueOf(number));
                }
            }
        });




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="+";
                firstNumber=number;
                number=0;
                data.setText(data.getText().toString()+"+");
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="-";
                firstNumber=number;
                number=0;
                data.setText(data.getText().toString()+"-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="*";
                firstNumber=number;
                number=0;
                data.setText(data.getText().toString()+"*");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="/";
                firstNumber=number;
                number=0;
                data.setText(data.getText().toString()+"/");
            }
        });



        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNumber=number;
                number=0;
                doTheCalculation(operation);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=0;
                firstNumber=0;
                secondNumber=0;
                answer.setText("");
                data.setText("");
                operation="";
            }
        });

    }


    private void doTheCalculation(String operation) {

            try {

                int ans = 0;
                switch (operation) {
                    case "+" : {
                        ans = firstNumber + secondNumber;
                        break;
                    }
                    case "-" : {
                        ans = firstNumber - secondNumber;
                        break;
                    }
                    case "*" : {
                        ans = firstNumber * secondNumber;
                        break;
                    }
                    default: {
                        ans = firstNumber / secondNumber;
                        break;
                    }
                }

                String Answer = String.valueOf(ans);
                number=ans;
                operation="";
                answer.setText(Answer);

            } catch (Exception e) {
                showToast("Invalid Inputs");
                Log.e("Conversion error", e.getMessage());
            }



    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }

    public void numberclick(View view) {

    }
}