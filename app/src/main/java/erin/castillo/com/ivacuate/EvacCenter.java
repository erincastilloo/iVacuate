package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EvacCenter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_center);
    }
    public void evaccenter(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnCaloo) {
            i = new Intent(this, evacCaloo.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnMnl) {
            i = new Intent(this, evacManila.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnManda) {
            i = new Intent(this, evacManda.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnMakati) {
            i = new Intent(this, evacMakati.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.btnNavotas) {
            i = new Intent(this, evacNavotas.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.btnPasay) {
            i = new Intent(this, evacPasay.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.btnSanJuan) {
            i = new Intent(this, evacSanJuan.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.btnTaguig) {
            i = new Intent(this, evacTaguig.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.btnQuezon) {
            i = new Intent(this, evacQuezon.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.btnVal) {
            i = new Intent(this, evacValenzuela.class);
            startActivity(i);
        }
    }
}
