package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mandaElem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manda_elem);
    }
    public void mandaelembtn (View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnElem){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.586353, 121.025143")); //latitude longitude ng place
            chooser = Intent.createChooser(i, "Choose Application for Maps");
            startActivity(chooser);
        }
    }
}
