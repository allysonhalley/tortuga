package com.pa.allyson.tortugacollector.dao;

import android.content.ContentValues;
import android.content.Context;

import com.pa.allyson.tortugacollector.DbGateway;

public class UserDAO {
    private final String TABLE_USERS = "Users";
    private DbGateway gw;

    public UserDAO(Context ctx){
        gw = DbGateway.getInstance(ctx);
    }

    public boolean save(int id, String email, String password){
        ContentValues cv = new ContentValues();
        cv.put("Email", email);
        cv.put("Password", password);
        return gw.getDatabase().insert(TABLE_USERS, null, cv) > 0;
    }
}
