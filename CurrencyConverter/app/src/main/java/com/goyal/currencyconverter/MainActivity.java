package com.goyal.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButtonClicked(View view) {
        EditText dollarText = (EditText) findViewById(R.id.dollarText);
        Float dollarAmount = Float.valueOf(dollarText.getText().toString());

        Toast.makeText(this, "Rs. " + dollarAmount*64.64, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
