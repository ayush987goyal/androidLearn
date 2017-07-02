package com.goyal.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void loginButtonClicked(View view) {
        EditText username = (EditText) findViewById(R.id.usernameTextField);
        EditText password = (EditText) findViewById(R.id.passwordField);

        Log.i("Info", "Username: " + username.getText().toString() + " Password: " + password.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
