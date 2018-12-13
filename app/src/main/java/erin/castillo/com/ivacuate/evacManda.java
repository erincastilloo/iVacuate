package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacManda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_manda);
    }
    public void evacmanda(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.picMandaGym) {
            i = new Intent(this, mandaGym.class);
            startActivity(i);
        } else if (v.getId() == R.id.picMandaElem) {
            i = new Intent(this, mandaElem.class);
            startActivity(i);
        }
    }
}
