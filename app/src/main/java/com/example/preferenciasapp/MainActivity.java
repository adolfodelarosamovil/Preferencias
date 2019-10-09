package com.example.preferenciasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String NOMBRE_FICHERO_PREFS = "preferencias";
    public static final String CLAVE_PRIMERA_VEZ = "primera_vez";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Si es la primera vez
            //informo
        //SI NO
            //informo
        SharedPreferences sp = getSharedPreferences(NOMBRE_FICHERO_PREFS, MODE_PRIVATE);
        boolean primera_vez = sp.getBoolean(CLAVE_PRIMERA_VEZ, true);

        if(primera_vez){
            Log.d("MIAPP", "Es la primera vez que entra");
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean(CLAVE_PRIMERA_VEZ, false);
            editor.commit();
        }else{
            Log.d("MIAPP", "NO Es la primera vez que entra");
        }
    }
}
