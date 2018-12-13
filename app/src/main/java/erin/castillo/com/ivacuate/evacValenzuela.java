package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacValenzuela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_valenzuela);
    }
    public void evacvalenzuela(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.pic3Scenter) {
            i = new Intent(this, threescenter.class);
            startActivity(i);
        } else if (v.getId() == R.id.picParada) {
            i = new Intent(this, parada.class);
            startActivity(i);
        }
    }
}
