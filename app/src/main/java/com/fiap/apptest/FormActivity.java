package com.fiap.apptest;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.fiap.apptest.model.Participant;
import com.fiap.apptest.utils.Constants;

public class FormActivity extends AppCompatActivity {

    private TextView user_logged;
    private TextInputLayout tilName;
    private TextInputLayout tilEmail;
    private TextInputLayout tilPhone;
    private TextInputLayout tilWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        user_logged = (TextView) findViewById(R.id.lbl_user_logged);

        tilName = (TextInputLayout) findViewById(R.id.tilUser);
        tilEmail = (TextInputLayout) findViewById(R.id.tilEmail);
        tilPhone = (TextInputLayout) findViewById(R.id.tilPhone);
        tilWebsite = (TextInputLayout) findViewById(R.id.tilWebsite);

        if (getIntent() != null) {
            user_logged.setText(getIntent().getStringExtra(Constants.KEY_USER));
        }
    }

    public void doSignup(View v) {
        Participant p = new Participant();
        p.setName(tilName.getEditText().toString());
        p.setEmail(tilEmail.getEditText().toString());
        p.setPhone(tilPhone.getEditText().toString());
        p.setWebsite(tilWebsite.getEditText().toString());

        Intent i = new Intent(this, ConfirmActivity.class);
        i.putExtra(Constants.KEY_PARTICIPANT, p);

        startActivity(i);
    }
}
