package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacCaloo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_caloo);
    }
    public void evaccaloocan(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.picLoma) {
            i = new Intent(this, laloma.class);
            startActivity(i);
        } else if (v.getId() == R.id.picMCU) {
            i = new Intent(this, manilaCentral.class);
            startActivity(i);
        }
    }
}
