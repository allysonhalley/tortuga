package br.com.ahsr.tortugalpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
    }

    public void requestTruckFromCustomer(View view) {
        Intent intent = new Intent(CustomerActivity.this, RequestTruckActivity.class);
        startActivity(intent);
    }
    public void clickEvent(){
        Button buttonRequestTruck = (Button) findViewById(R.id.button_request_truck);
        buttonRequestTruck.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                requestTruckFromCustomer(v);
            }
        });


    }


}
