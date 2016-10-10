package br.com.ahsr.tortuga30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.ahsr.tortuga2.model.User;
import br.com.ahsr.tortuga2.repository.UserLocalRepository;

public class RegisterCustomerActivity extends AppCompatActivity implements View.OnClickListener {

    UserLocalRepository userLocalRepository;
    EditText etName, etAge, etUsername;
    Button bRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_customer);

        etUsername = (EditText) findViewById(R.id.edit_text_name_register_customer);
        etName = (EditText) findViewById(R.id.edit_text_user_name_register_customere);
        bRegister = (Button) findViewById(R.id.button_register_customer);

        bRegister.setOnClickListener(this);

        userLocalRepository = new UserLocalRepository(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_register_customer:
                userLocalRepository.clearUserData();
                userLocalRepository.setUserLoggedIn(false);
                Intent loginIntent = new Intent(this, LoginActivity.class);
                startActivity(loginIntent);
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (authenticate() == true) {
            displayUserDetails();
        }
    }

    private boolean authenticate() {
        if (userLocalRepository.getLoggedInUser() == null) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            return false;
        }
        return true;
    }

    private void displayUserDetails() {
        User user = userLocalRepository.getLoggedInUser();
        etUsername.setText(user.getUserName());
        etName.setText(user.getName());
    }
}
