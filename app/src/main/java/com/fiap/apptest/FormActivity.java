package com.fiap.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fiap.apptest.utils.Constants;

public class FormActivity extends AppCompatActivity {

    private TextView user_logged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        user_logged = (TextView) findViewById(R.id.lbl_user_logged);

        if (getIntent() != null) {
            user_logged.setText(getIntent().getStringExtra(Constants.KEY_USER));
        }
    }

    public void doSignup(View v) {
    }
}
