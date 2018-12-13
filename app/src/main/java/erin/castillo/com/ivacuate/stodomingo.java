package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class stodomingo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stodomingo);
    }
    public void domingobtn (View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnStodomingo){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.626276, 121.010186")); //latitude longitude ng place
            chooser = Intent.createChooser(i, "Choose Application for Maps");
            startActivity(chooser);
        }
    }
}
