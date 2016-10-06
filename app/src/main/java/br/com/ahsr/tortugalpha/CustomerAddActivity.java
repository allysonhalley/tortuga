package br.com.ahsr.tortugalpha;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.ahsr.tortugalpha.model.User;

public class CustomerAddActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonRegisterCostumer;
    EditText etName, etUserName, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_add);

        etName = (EditText) findViewById(R.id.edit_text_name_register_customer);
        etUserName = (EditText) findViewById(R.id.edit_text_user_name_register_customer);
        etPassword = (EditText) findViewById(R.id.edit_text_password_register_customer);
        buttonRegisterCostumer = (Button) findViewById(R.id.button_register_customer);

        buttonRegisterCostumer.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_register_customer:

                String name = etName.getText().toString();
                String userName = etUserName.getText().toString();
                String password = etPassword.getText().toString();

                User userRegister = new User(name, userName, password);

                break;
        }
    }

}
