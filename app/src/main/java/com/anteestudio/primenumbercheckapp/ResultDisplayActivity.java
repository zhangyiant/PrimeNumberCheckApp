package com.anteestudio.primenumbercheckapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_display);
        Intent intent = getIntent();
        int number = intent.getIntExtra(MainActivity.NUMBER, 0);

        boolean isPrimeNumber = false;
        String result;
        if (isPrimeNumber) {
            result = getString(R.string.prime_number);
        } else {
            result = getString(R.string.not_prime_number);
        }
        TextView textView = (TextView)findViewById(R.id.primeResult);
        textView.setText(result);
    }
}