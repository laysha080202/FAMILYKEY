package com.example.familykey;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

   // Esta parte se refiere a la utilidad que va ir teniendo cada boton en la interaccion
public class Registro extends AppCompatActivity {
    EditText nombre, apellido, celular, correo;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);

        nombre = findViewById(R.id.);
        apellido = findViewById(R.id.);
        celular = findViewById(R.id.);
        correo= findViewById(R.id.);

        bt = findViewById(R.id.btres);

/*
        nombre.setText(data.getString("nombre"));
        apellido.setText(data.getString("apellido"));
        numero.setText(data.getString(""));
        nivel_academico.setText(data.getString("nivel_academico"));*/

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BASEDEDATOS admin = new BASEDEDATOS(Registro.this,"BASEDEDATOS", null, 1);
                SQLiteDatabase BD = admin.getWritableDatabase();

                String nom = nombre.getText().toString();
                String ape = apellido.getText().toString();
// comenzamos a darle funcionalidad a los registros
                if (!nom.isEmpty() && !ape.isEmpty()){
                    ContentValues datos = new ContentValues();
                    datos.put("nombre", nom);
                    datos.put("apellido",ape);

                   /* if (celular.isChecked()==true) datos.put("genero", "M");
                    else datos.put("genero", "F");

                    if (EST.isChecked()==true) datos.put("nivel_academico","E");
                    else datos.put("nivel_academico", "A");*/

                    try {
                        BD.insert("registro", null, datos);
                        BD.close();
                    }catch (Exception e){
                        Toast.makeText(Registro.this,e.toString(),Toast.LENGTH_LONG).show();
                    }

                    limpiar();
                    Toast.makeText(Registro.this,"se ha  guardado correctamente",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Registro.this, paginaprincipal.class);
                    startActivity(i);
                }else {
                    Toast.makeText(Registro.this,"rellene los campos",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void limpiar(){
        nombre.setText("");
        apellido.setText("");


    }
}