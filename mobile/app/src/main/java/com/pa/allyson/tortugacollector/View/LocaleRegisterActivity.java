package com.pa.allyson.tortugacollector.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pa.allyson.tortugacollector.R;

public class LocaleRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locale_register);

        final EditText txStreet = (EditText) findViewById(R.id.txStreet);
        final EditText txNumber = (EditText) findViewById(R.id.txNumber);
        final EditText txCEP = (EditText) findViewById(R.id.txCEP);
        final EditText txCity = (EditText) findViewById(R.id.txCity);
        final Button btRegister = (Button) findViewById(R.id.btRegister);
        final Button btCancel = (Button) findViewById(R.id.btCancel);

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LocaleRegisterActivity.this, ClientRegisterActivity.class);
                LocaleRegisterActivity.this.startActivity(registerIntent);
            }
        });

        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LocaleRegisterActivity.this, LoginActivity.class);
                LocaleRegisterActivity.this.startActivity(registerIntent);
            }
        });
    }
}
