package com.anteestudio.primenumbercheckapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NUMBER = "com.anteestudio.primenumbercheckapp.NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkPrimeNumber(View view) {
        Intent intent = new Intent(this, ResultDisplayActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        int number = Integer.valueOf(editText.getText().toString());
        intent.putExtra(NUMBER, number);
        startActivity(intent);
    }
}