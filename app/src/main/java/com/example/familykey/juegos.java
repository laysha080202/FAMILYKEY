package com.example.familykey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class juegos extends AppCompatActivity {
    Button bt_free,bt_clash,bt_clan,bt_back1,bt_conex1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);
        bt_free=findViewById(R.id.FREE FIRE);
        bt_clash=findViewById(R.id.CLASH_ROLAYE);
        bt_clan=findViewById(R.id.CLASH_OF_CLAN);
        bt_back1=findViewById(R.id.ATRAS1);
        bt_conex1=findViewById(R.id.CONEXION1);
    }
    @Override
    public void onClick(View view) {
        Intent i = new Intent(juegos.this, paginaprincipal.class);
        startActivity(i);
    }
      bt_free.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(juegos.this, paginaprincipal.class);
            startActivity(i);
        }
    }
      bt_clash.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(juegos.this, paginaprincipal.class);
            startActivity(i);
        }
    }
    bt_clan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(juegos.this, paginaprincipal.class);
            startActivity(i);
        }
    }
    bt_back1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(juegos.this, paginaprincipal.class);
            startActivity(i);
        }
    }
    bt_conex1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(juegos.this, paginaprincipal.class);
            startActivity(i);
        }
    });
}

