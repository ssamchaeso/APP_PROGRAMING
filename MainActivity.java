package com.example.appprograming1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText idText;
    private EditText passwordText;
    private EditText phoneText;
    private Button button;

    private TextView idTextView;

    private TextView passwordTextView;
    private TextView phoneTextView;


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
        idText = (EditText) findViewById(R.id.editTextId);
        passwordText = (EditText) findViewById(R.id.editTextTextPassword);
        phoneText = (EditText) findViewById(R.id.editTextPhone);

        button = (Button) findViewById(R.id.button);

        idTextView = (TextView) findViewById(R.id.textView);
        passwordTextView = (TextView) findViewById(R.id.textView2);
        phoneTextView = (TextView) findViewById(R.id.textView3);

    }

    public void onClicked(View view) {
        String id = idText.getText().toString();
        idTextView.setText("아이디:  "+id);

        String password = passwordText.getText().toString();
        passwordTextView.setText("패스워드:  "+password);

        String phone = phoneText.getText().toString();
        phoneTextView.setText("전화번호:  "+phone);
    }
}