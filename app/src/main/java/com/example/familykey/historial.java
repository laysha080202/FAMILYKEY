package com.example.familykey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class historial extends AppCompatActivity {
    Button bt_you,bt_play,bt_google,bt_back,bt_conex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        bt_you=findViewById(R.id.bt_you);
        bt_play=findViewById(R.id.bt_play);
        bt_google=findViewById(R.id.bt_goo);
        bt_back=findViewById(R.id.bt_back1);
        bt_conex=findViewById(R.id.bt_conex1);

        bt_you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(historial.this,paginaprincipal.class);
                startActivity(i);
            }
        });

        bt_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(historial.this,paginaprincipal.class);
                startActivity(i);
            }
        });

        bt_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(historial.this,paginaprincipal.class);
                startActivity(i);
            }
        });
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(historial.this,paginaprincipal.class);
                startActivity(i);
            }
        });

      bt_conex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(historial.this,paginaprincipal.class);
                startActivity(i);
            }
        });
    }
}