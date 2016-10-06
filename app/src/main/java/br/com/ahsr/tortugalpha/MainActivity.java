package br.com.ahsr.tortugalpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonLogin = (Button) findViewById(R.id.button_login);
    Button buttonAddCustomer = (Button) findViewById(R.id.button_add_customer);
    EditText edTxUserName = (EditText) findViewById(R.id.edit_user_name);
    EditText edTxPassword = (EditText) findViewById(R.id.edit_password);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickEvent(){


        buttonLogin.setOnClickListener(this);
        buttonAddCustomer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_login:
                startActivity(new Intent(MainActivity.this, CustomerActivity.class));


                break;
            case R.id.button_add_customer:
                startActivity(new Intent(MainActivity.this, CustomerAddActivity.class));
                break;
        }
    }
}