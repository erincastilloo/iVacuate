package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacSanJuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_san_juan);
    }
    public void evacsanjuan(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.picSalapan) {
            i = new Intent(this, salapanhall.class);
            startActivity(i);
        } else if (v.getId() == R.id.picPinaglaban) {
            i = new Intent(this, pinaglabanan.class);
            startActivity(i);
        }
    }
}
