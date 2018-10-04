package com.pa.allyson.tortugacollector;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Tortuga.db";
    private static final int DATABASE_VERSION = 1;
    private final String CREATE_TABLE =
            "CREATE TABLE Locale (ID INTEGER PRIMARY KEY AUTOINCREMENT, Street TEXT NOT NULL, number TEXT NOT NULL, CEF TEXT NOT NULL, City TEXT NOT NULL, Latitude TEXT, Longitude TEXT);";

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}