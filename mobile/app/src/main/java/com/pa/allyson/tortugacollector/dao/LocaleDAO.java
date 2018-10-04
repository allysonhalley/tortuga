package com.pa.allyson.tortugacollector.dao;


import android.content.ContentValues;
import android.content.Context;

import com.pa.allyson.tortugacollector.DbGateway;

public class LocaleDAO {

    private final String TABLE_LOCALES = "Locales";
    private DbGateway gw;

    public LocaleDAO(Context ctx){
        gw = DbGateway.getInstance(ctx);
    }

    public boolean save(int id, String street, String number, String cep, String city){
        ContentValues cv = new ContentValues();
        cv.put("Name", street);
        cv.put("Number", number);
        cv.put("CEP", cep);
        cv.put("City", city);
        return gw.getDatabase().insert(TABLE_LOCALES, null, cv) > 0;
    }
}