package com.pa.allyson.tortugacollector.dao;

import android.content.ContentValues;
import android.content.Context;
import com.pa.allyson.tortugacollector.DbGateway;
import com.pa.allyson.tortugacollector.model.Locale;

public class ClientDAO {

    private final String TABLE_CLIENTS = "Clients";
    private DbGateway gw;

    public ClientDAO(Context ctx){
        gw = DbGateway.getInstance(ctx);
    }

    public boolean save(int id, String name, String cpf, String email, String phone){
        ContentValues cv = new ContentValues();
        cv.put("Name", name);
        cv.put("CPF", cpf);
//        cv.put("Adress", adress);
        cv.put("Email", email);
        cv.put("Phone", phone);
        return gw.getDatabase().insert(TABLE_CLIENTS, null, cv) > 0;
    }
}