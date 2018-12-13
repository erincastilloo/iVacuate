package erin.castillo.com.ivacuate;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class mandaGym extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manda_gym);
    }
    public void mandagymbtn (View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnMandagym){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.577032, 121.034378")); //latitude longitude ng place
            chooser = Intent.createChooser(i, "Choose Application for Maps");
            startActivity(chooser);
        }
    }
}
