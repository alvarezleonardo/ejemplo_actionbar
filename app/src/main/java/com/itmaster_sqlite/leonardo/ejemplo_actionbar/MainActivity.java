package com.itmaster_sqlite.leonardo.ejemplo_actionbar;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setTitle("Ejemplo");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //acciones android puras
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        //acciones del menu definido por el desarrollador
        switch (item.getItemId()) {
            case R.id.agregar_cli:

                Toast.makeText(this, "Agregar Cliente", Toast.LENGTH_SHORT).show();
                break;
            case R.id.salir:
                super.finish();
                break;
            default:
                break;
        }
        return true;
    }
}
