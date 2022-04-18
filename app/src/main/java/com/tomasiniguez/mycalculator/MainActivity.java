package com.tomasiniguez.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDiv, btnDot, btnTimes, btnPlus, btnMin, btnEnter, btnCut;
    TextView txtOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        btnDiv = findViewById(R.id.btn_div);
        btnDot = findViewById(R.id.btn_dot);
        btnTimes = findViewById(R.id.btn_times);
        btnPlus = findViewById(R.id.btn_plus);
        btnMin = findViewById(R.id.btn_minus);
        btnEnter = findViewById(R.id.btn_enter);
        btnCut = findViewById(R.id.btn_cut);
        txtOut = findViewById(R.id.txt_out);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "0");
            }
        });
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = txtOut.getText().toString();
                if (num.contains("/")) {
                    String[] splitNum = num.split("/");
                    double firstNum = Double.valueOf(splitNum[0]);
                    double secondNum = Double.valueOf(splitNum[1]);
                    txtOut.setText(String.valueOf(divide(firstNum, secondNum)));
                } else if (num.contains("x")) {
                    String[] splitNum = num.split("x");
                    double firstNum = Double.valueOf(splitNum[0]);
                    double secondNum = Double.valueOf(splitNum[1]);
                    txtOut.setText(String.valueOf(times(firstNum, secondNum)));
                } else if (num.contains("-")) {
                    String[] splitNum = num.split("-");
                    double firstNum = Double.valueOf(splitNum[0]);
                    double secondNum = Double.valueOf(splitNum[1]);
                    txtOut.setText(String.valueOf(minus(firstNum, secondNum)));
                } else if (num.contains("+")) {
                    String[] splitNum = num.split("\\+");
                    double firstNum = Double.valueOf(splitNum[0]);
                    double secondNum = Double.valueOf(splitNum[1]);
                    txtOut.setText(String.valueOf(add(firstNum, secondNum)));
                }
            }
        });
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "-");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "+");
            }
        });
        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "x");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + ".");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText(txtOut.getText().toString() + "/");
            }
        });
        btnCut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOut.setText("");
            }
        });

    }
    double divide(double a, double b){
        return a / b;
    }
    double times(double a, double b){
        return a * b;
    }
    double minus(double a, double b){
        return a - b;
    }
    double add(double a, double b){
        return a + b;
    }
}