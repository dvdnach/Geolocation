package com.example.dm2.geolocation;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView lbllatitud,lbllongitud;
    private ToggleButton btnactualizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbllatitud=(TextView)findViewById(R.id.lbllatitud);
        lbllongitud=(TextView)findViewById(R.id.lbllongitud);
        btnactualizar=(ToggleButton)findViewById(R.id.btnactualizar);
        
    }

    private void updateUI(Location loc)
    {
        if (loc!=null)
        {
            lbllatitud.setText("Latitud: "+String.valueOf(loc.getLatitude()));
            lbllongitud.setText("Longitud: "+String.valueOf(loc.getLongitude()));
        }
        else
        {
            lbllatitud.setText("Latitud: desconocida");
            lbllongitud.setText("Longitud: desconocida");
        }
    }

}
