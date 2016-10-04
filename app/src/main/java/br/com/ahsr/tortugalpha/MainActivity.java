package br.com.ahsr.tortugalpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callCustomerFromMain(View view) {
        Intent intent = new Intent(MainActivity.this, CustomerActivity.class);
        startActivity(intent);
    }
    public void callAddCustomerFromMain(View view) {
        Intent intent = new Intent(MainActivity.this, CustomerAddActivity.class);
        startActivity(intent);
    }
    public void clickEvent(){
        Button buttonLogin = (Button) findViewById(R.id.button_login);
        buttonLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                callCustomerFromMain(v);
            }
        });

        Button buttonAddCustomer = (Button) findViewById(R.id.button_add_customer);
        buttonAddCustomer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                callAddCustomerFromMain(v);
            }
        });
    }
}
