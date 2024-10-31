package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    EditText editNumberOne, editNumberTwo;
    Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        editNumberOne = findViewById(R.id.editNumberOne);
        editNumberTwo = findViewById(R.id.editNumberTwo);
        buttonAdd = findViewById(R.id.buttonAdd);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    float num1 = Float.parseFloat(editNumberOne.getText().toString());
                    float num2 = Float.parseFloat(editNumberTwo.getText().toString());
                    float res = num1 + num2;
                    resultTextView.setText(String.valueOf(res));
                }
                catch (Exception exception)
                {
                    resultTextView.setText("Error");
                };
            }
        });
    }
}