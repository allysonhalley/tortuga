package com.pa.allyson.tortugacollector.View;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pa.allyson.tortugacollector.R;
import com.pa.allyson.tortugacollector.model.User;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText txEmail = (EditText) findViewById(R.id.txEmail);
        final EditText txPassword = (EditText) findViewById(R.id.txPassword);
        final Button btSigIn= (Button) findViewById(R.id.btSignIn);
        final Button btRegister = (Button) findViewById(R.id.btRegister);

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, LocaleRegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}

