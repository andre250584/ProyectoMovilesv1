package com.example.stagetwo.proyectomovilesv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class LugaresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_prinicipal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();
        if (id==R.id.menu_inicio){
            Intent intent = new Intent(this,principal.class);
            this.startActivity(intent);
            return true;
        }
        if (id==R.id.menu_redes){
            Intent intent = new Intent(this,redesActivity.class);
            this.startActivity(intent);
            return true;
        }
        if (id==R.id.menu_lugares){
            Intent intent = new Intent(this,LugaresActivity.class);
            this.startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
