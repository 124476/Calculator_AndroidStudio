package com.example.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    }

    public void buttonAddClick(View v) {
        try
        {
            float num1 = Float.parseFloat(editNumberOne.getText().toString());
            float num2 = Float.parseFloat(editNumberTwo.getText().toString());
            float res = num1 + num2;
            resultTextView.setText(String.valueOf(res));

            Toast.makeText(this,"Accept", Toast.LENGTH_LONG).show();
        }
        catch (Exception exception)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Log");
            builder.setMessage("Error");
            builder.setCancelable(true);
            builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.show();
        };
    }
}