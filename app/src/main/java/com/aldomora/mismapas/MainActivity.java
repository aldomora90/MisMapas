package com.aldomora.mismapas;

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

    public void irTeatro(View v){
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("Lat",21.857125058276775);
        i.putExtra("Lon",-102.2915477043339);
        i.putExtra("Lugar","Teatro Aguascalientes");
        startActivity(i);
    }

    public void irCerro(View v){
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("Lat",21.884261903754034);
        i.putExtra("Lon",-102.41733928381883);
        i.putExtra("Lugar","Cerro del Picacho");
        startActivity(i);
    }

    public void irParque(View v){
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("Lat",21.852365248668235);
        i.putExtra("Lon",-102.29167645036661);
        i.putExtra("Lugar","Parque Rodolfo Landeros");
        startActivity(i);
    }

    public void irCC(View v){
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("Lat",21.924255813919558);
        i.putExtra("Lon",-102.28974928318941);
        i.putExtra("Lugar","Centro Comercial Altaria");
        startActivity(i);
    }
}
