package com.fiap.apptest;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected TextInputLayout tilUsername;
    protected TextInputLayout tilPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilUsername = (TextInputLayout) findViewById(R.id.tilUser);
        tilPassword = (TextInputLayout) findViewById(R.id.tilPassword);
    }

    public void doLogin(View v) {
        // reset error message
        tilPassword.setErrorEnabled(false);

        String user = tilUsername.getEditText().getText().toString();
        String password = tilPassword.getEditText().getText().toString();

        // isEmpty()
        if (user.equals("caue") && password.equals("123")) {
            Intent i = new Intent(this, FormActivity.class);
            startActivity(i);
        } else {
            tilPassword.setError("Invalid username and/or password");
        }
    }
}
