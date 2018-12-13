package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacNavotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_navotas);
    }
    public void evacnavotas(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.picNavotasElem) {
            i = new Intent(this, navotasElem.class);
            startActivity(i);
        } else if (v.getId() == R.id.picNavotasHigh) {
            i = new Intent(this, navotasHigh.class);
            startActivity(i);
        }
    }
}
