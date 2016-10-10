package br.com.ahsr.tortuga30.repository;

import android.content.Context;
import android.content.SharedPreferences;

import br.com.ahsr.tortuga2.model.User;

/**
 * Created by Allyson on 20/09/2016.
 */

public class UserLocalRepository {

    public static final String SP_NAME = "userDetails";

    SharedPreferences userLocalRepository;

    public UserLocalRepository(Context context) {
        userLocalRepository = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData(User user) {
        SharedPreferences.Editor userLocalDatabaseEditor = userLocalRepository.edit();
        userLocalDatabaseEditor.putString("name", user.getName());
        userLocalDatabaseEditor.putString("username", user.getUserName());
        userLocalDatabaseEditor.putString("password", user.getPassword());
        userLocalDatabaseEditor.commit();
    }

    public void setUserLoggedIn(boolean loggedIn) {
        SharedPreferences.Editor userLocalDatabaseEditor = userLocalRepository.edit();
        userLocalDatabaseEditor.putBoolean("loggedIn", loggedIn);
        userLocalDatabaseEditor.commit();
    }

    public void clearUserData() {
        SharedPreferences.Editor userLocalDatabaseEditor = userLocalRepository.edit();
        userLocalDatabaseEditor.clear();
        userLocalDatabaseEditor.commit();
    }

    public User getLoggedInUser() {
        if (userLocalRepository.getBoolean("loggedIn", false) == false) {
            return null;
        }

        String name = userLocalRepository.getString("name", "");
        String username = userLocalRepository.getString("username", "");
        String password = userLocalRepository.getString("password", "");
        int age = userLocalRepository.getInt("age", -1);

        User user = new User(name, username, password);
        return user;
    }
}



