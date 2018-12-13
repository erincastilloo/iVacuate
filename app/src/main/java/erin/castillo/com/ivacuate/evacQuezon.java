package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacQuezon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_quezon);
    }
    public void evacquezon(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.picStoDomingo) {
            i = new Intent(this, stodomingo.class);
            startActivity(i);
        } else if (v.getId() == R.id.picSingtala) {
            i = new Intent(this, singtala.class);
            startActivity(i);
        }
    }
}
