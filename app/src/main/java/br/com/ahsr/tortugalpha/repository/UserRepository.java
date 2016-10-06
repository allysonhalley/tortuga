package br.com.ahsr.tortugalpha.repository;

import android.content.Context;
import android.content.SharedPreferences;

import br.com.ahsr.tortugalpha.model.User;

/**
 * Created by Allyson on 20/09/2016.
 */

public class UserRepository {

    public static final String SP_NAME = "userDatails";
    SharedPreferences userLocalRepository;

    public UserRepository(Context context){
        userLocalRepository = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserRepository(User user){

        SharedPreferences.Editor spEditor = userLocalRepository.edit();

        spEditor.putString("user_name", user.getUserName());
        spEditor.putString("name", user.getPassword());
        spEditor.putString("password", user.getPassword());
        spEditor.commit();
    }

    public User getLoggedInUser() {

        String name = userLocalRepository.getString("name", "");
        String userName = userLocalRepository.getString("user_name", "");
        String password = userLocalRepository.getString("password", "");

        User storedUser = new User(name, userName, password);
        return storedUser;
    }

    public void setUserLoggenIn(boolean loggedIn){

        SharedPreferences.Editor spEditor = userLocalRepository.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }


    public void clearUsarRepository(){

        SharedPreferences.Editor spEditor = userLocalRepository.edit();
        spEditor.clear();
        spEditor.commit();
    }
}



