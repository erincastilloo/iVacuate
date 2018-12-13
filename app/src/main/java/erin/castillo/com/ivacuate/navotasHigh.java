package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class navotasHigh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navotas_high);
    }
    public void navotashighbtn (View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnNavotashigh){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.657892, 120.948509")); //latitude longitude ng place
            chooser = Intent.createChooser(i, "Choose Application for Maps");
            startActivity(chooser);
        }
    }
}
