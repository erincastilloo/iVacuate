package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacPasay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_pasay);
    }
    public void evacpasay(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.picCuneta) {
            i = new Intent(this, cuneta.class);
            startActivity(i);
        } else if (v.getId() == R.id.picPasayPool) {
            i = new Intent(this, pasaypool.class);
            startActivity(i);
        }
    }
}
