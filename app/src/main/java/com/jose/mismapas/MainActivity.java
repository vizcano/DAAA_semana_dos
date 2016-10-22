package com.jose.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapaCatedral(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("location", 1);
        startActivity(i);
    }

    public void irMapaBotines(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("location", 2);
        startActivity(i);
    }

    public void irMapaMusac(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("location", 3);
        startActivity(i);
    }

    public void irMapaMuseo(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("location", 4);
        startActivity(i);
    }
}
