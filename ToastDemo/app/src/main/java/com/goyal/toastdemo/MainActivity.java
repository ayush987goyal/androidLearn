package com.goyal.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickMeButtonClicked(View view) {

        EditText nameTextField = (EditText) findViewById(R.id.nameTextField);

        Toast.makeText(this, "Hi there " + nameTextField.getText().toString() + "!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
