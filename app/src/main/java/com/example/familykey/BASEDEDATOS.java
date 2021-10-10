package com.example.familykey;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BASEDEDATOS extends SQLiteOpenHelper{

    //Esta parte de la base de datos es el comienzo con esta estamos creando desde el principio
    public BASEDEDATOS(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
// Las tablas de la base de datos
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table registro(nombre text primary key, apellido text, telefono int, correo text)");

    }

  // Señalamos la espera para conectar la base de datos
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }
}
