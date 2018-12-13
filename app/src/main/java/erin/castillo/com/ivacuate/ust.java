package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ust extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ust);
    }
    public void ustbtn (View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnUst){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.609534, 120.989824")); //latitude longitude ng place
            chooser = Intent.createChooser(i, "Choose Application for Maps");
            startActivity(chooser);
        }
    }
}
