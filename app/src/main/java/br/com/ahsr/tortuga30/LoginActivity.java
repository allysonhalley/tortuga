package br.com.ahsr.tortuga30;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.ahsr.tortuga2.model.User;
import br.com.ahsr.tortuga2.repository.UserLocalRepository;
import br.com.ahsr.tortuga2.util.ServerRequests;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button bLogin, registerLink;
    EditText etUsername, etPassword;

    UserLocalRepository userLocalRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bLogin = (Button) findViewById(R.id.button_login);
        etUsername = (EditText) findViewById(R.id.edit_user_name);
        etPassword = (EditText) findViewById(R.id.edit_password);
        registerLink = (Button) findViewById(R.id.button_register);

        bLogin.setOnClickListener(this);
        registerLink.setOnClickListener(this);

        userLocalRepository = new UserLocalRepository(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_login:
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                User user = new User(username, password);

                authenticate(user);
                break;
            case R.id.button_register:
                Intent registerIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(registerIntent);
                break;
        }
    }

    private void authenticate(User user) {
        ServerRequests serverRequest = new ServerRequests(this);
        serverRequest.fetchUserDataAsyncTask(user, new GetUserCallback();
    }

    private void showErrorMessage() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(LoginActivity.this);
        dialogBuilder.setMessage("Incorrect user details");
        dialogBuilder.setPositiveButton("Ok", null);
        dialogBuilder.show();
    }

    private void logUserIn(User returnedUser) {
        userLocalRepository.storeUserData(returnedUser);
        userLocalRepository.setUserLoggedIn(true);
        startActivity(new Intent(this, RegisterCustomerActivity.class));
    }
}
