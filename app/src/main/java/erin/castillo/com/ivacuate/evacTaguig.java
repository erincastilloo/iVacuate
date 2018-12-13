package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacTaguig extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_taguig);
    }
    public void evactaguig(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.picSenator) {
            i = new Intent(this, senator.class);
            startActivity(i);
        } else if (v.getId() == R.id.picTaguighigh) {
            i = new Intent(this, taguigscience.class);
            startActivity(i);
        }
    }
}
