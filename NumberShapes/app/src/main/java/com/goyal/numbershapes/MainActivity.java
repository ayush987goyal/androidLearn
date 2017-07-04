package com.goyal.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.goyal.numbershapes.Number;

public class MainActivity extends AppCompatActivity {

    public void checkNumberButtonClick(View view){
        if((((EditText)(findViewById(R.id.numberText))).getText().toString()).isEmpty()){
            Toast.makeText(this, "Please enter a number!", Toast.LENGTH_SHORT).show();
        }
        else {

            int number = Integer.parseInt(((EditText) (findViewById(R.id.numberText))).getText().toString());

            Number num = new Number();
            num.number = number;
            if (num.isTriangular() && num.isSquare()) {
                Toast.makeText(this, "Number is triangular and square!", Toast.LENGTH_SHORT).show();
            } else if (num.isSquare()) {
                Toast.makeText(this, "Number is square!", Toast.LENGTH_SHORT).show();
            } else if (num.isTriangular()) {
                Toast.makeText(this, "Number is triangular!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Number is nothing!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
