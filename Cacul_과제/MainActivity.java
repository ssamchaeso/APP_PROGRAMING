package com.example.cacul_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private String operator;
    private boolean input=true;
    private String cinput;
    private TextView txt;
    private double num1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txt= findViewById(R.id.textView);
    }
    public void ahng(View view) {
        Button btn=(Button) view;
        String buttontext= btn.getText().toString();

        if(input){
                    cinput=buttontext;
                    input=false;
                }
        else{
                    cinput+=buttontext;
                }
                txt.setText(cinput);
        }
    public void opclick(View view) {
        if(!cinput.isEmpty()){
            Button btn = (Button) view;
            num1=Double.parseDouble(cinput);
            operator=btn.getText().toString();

            input=true;
        }
    }
    public void resultclick(View view) {

        double result = 0;
        if (!cinput.isEmpty() && !operator.isEmpty()) {
            double num2 = Double.parseDouble(cinput);


            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "%":
                    result = num1 / num2;
                    break;
            }

        }
        txt.setText(String.valueOf(result));
        input=true;
    }
    public void clearClick(View view) {
        cinput="";
        operator="";
        input=true;
        txt.setText("");
    }
}