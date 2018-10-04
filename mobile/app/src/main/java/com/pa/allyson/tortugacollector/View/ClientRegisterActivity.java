package com.pa.allyson.tortugacollector.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pa.allyson.tortugacollector.R;

public class ClientRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_register);

        final EditText txName = (EditText) findViewById(R.id.txName);
        final EditText txCPF = (EditText) findViewById(R.id.txCPF);
        final EditText txEmail = (EditText) findViewById(R.id.txEmail);
        final EditText txPhone = (EditText) findViewById(R.id.txPhone);
        final Button btRegister = (Button) findViewById(R.id.btRegister);
        final Button btCancel = (Button) findViewById(R.id.btCancel);

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(ClientRegisterActivity.this, ScheduleCollectionActivity.class);
                ClientRegisterActivity.this.startActivity(registerIntent);
            }
        });

        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(ClientRegisterActivity.this, LoginActivity.class);
                ClientRegisterActivity.this.startActivity(registerIntent);
            }
        });
    }

}
