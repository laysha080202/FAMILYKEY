package com.example.familykey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paginaprincipal extends AppCompatActivity {
    //Este codigo se utilizara para darle funcionalidad a los botones de la pagina principal, cada uno te llevara a los distintos activitys
    Button bt, bt1, bt2, bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaprincipal);
        bt = findViewById(R.id.bt_con);
        bt1 = findViewById(R.id.bt_hist);
        bt2 = findViewById(R.id.bt_jue);
        bt3 = findViewById(R.id.bt_app);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(paginaprincipal.this, Conexion.class);
                startActivity(i);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(paginaprincipal.this, historial.class);
                startActivity(i);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(paginaprincipal.this,juegos.class);
                startActivity(i);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(paginaprincipal.this, app.class);
                startActivity(i);
            }
        });
    }
}