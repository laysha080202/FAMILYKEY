package com.example.familykey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Conexion extends AppCompatActivity {

    final String networkSSID = "REDWIFI";
    String networkPass = "password";
    WifiConfiguration conf = new WifiConfiguration();
    Button bt, bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conexion);

        //Esta parte del codigo es  para conectara internet

        conf.SSID = "\"" + networkSSID + "\"";
        conf.preSharedKey = "\"" + networkPass + "\"";

        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);

        if ((wifiManager.isWifiEnabled() == false)) {
            Toast.makeText(Conexion.this, "Conectando a WIFI...", Toast.LENGTH_LONG).show();
            wifiManager.setWifiEnabled(true);
        }

        wifiManager.addNetwork(conf);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;

        }

        //Esta parte del codigo es la de los botones

        bt = findViewById(R.id.bt_con);
        bt1 = findViewById(R.id.bt_hist);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Conexion.this,paginaprincipal.class);
                startActivity(i);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Conexion.this, paginaprincipal.class);
                startActivity(i);
            }
        });

            }
        }
