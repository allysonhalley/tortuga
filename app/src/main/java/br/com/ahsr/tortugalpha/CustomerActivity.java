package br.com.ahsr.tortugalpha;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomerActivity extends AppCompatActivity {

    Button buttonRequestTruck, buttonCallAtendent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

    }

    public void requestTruckFromCustomer(View view) {
        Intent intent = new Intent(CustomerActivity.this, RequestTruckActivity.class);
        startActivity(intent);
    }

    public void viewLogRequesCustomer(View view) {
        Intent intent = new Intent(CustomerActivity.this, CustomerLogRequestActivity.class);
        startActivity(intent);
    }

    public void callCustomerToAtendent(View view) {

        Uri uri = Uri.parse("999999999");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }

    public void clickEvent(){
        buttonRequestTruck = (Button) findViewById(R.id.button_request_truck);
        buttonRequestTruck.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                requestTruckFromCustomer(v);
            }
        });

        buttonCallAtendent = (Button) findViewById(R.id.button_customer_atendent_call);
        buttonCallAtendent.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                callCustomerToAtendent(v);
            }
        });

    }


}
