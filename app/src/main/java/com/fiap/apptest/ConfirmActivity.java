package com.fiap.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fiap.apptest.model.Participant;
import com.fiap.apptest.utils.Constants;

public class ConfirmActivity extends AppCompatActivity {

    private TextView tvEmail;
    private TextView tvTelefone;
    private TextView tvSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvTelefone = (TextView) findViewById(R.id.tvTelefone);
        tvSite = (TextView) findViewById(R.id.tvSite);

        if (getIntent() != null) {
            Participant p = getIntent().getParcelableExtra(Constants.KEY_PARTICIPANT);
            tvEmail.setText(p.getEmail());
            tvTelefone.setText(p.getPhone());
            tvSite.setText(p.getWebsite());
        }
    }

    public void sendEmail (View v) {

    }

    public void editEmail (View v) {

    }

    public void sendSMS (View v) {

    }

    public void editPhone (View v) {

    }

    public void call (View v) {

    }

    public void openWebsite (View v) {

    }

    public void editWebsite (View v) {

    }
}
