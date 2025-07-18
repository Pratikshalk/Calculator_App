package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirst, etSecond;
    TextView tvAns;
    Button add, sub, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);

        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue + secondValue;
                tvAns.setText("Ans is = "+ ans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue - secondValue;
                tvAns.setText("Ans is = "+ ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue * secondValue;
                tvAns.setText("Ans is = "+ ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double firstValue, secondValue;
                Double ans;

                firstValue = Double.parseDouble(etFirst.getText().toString());
                secondValue = Double.parseDouble(etSecond.getText().toString());

                ans = firstValue / secondValue;
                tvAns.setText("Ans is = "+ ans);
            }
        });
    }
}