package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class senator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senator);
    }
    public void senatorbtn (View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnSenator){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.525395, 121.061235")); //latitude longitude ng place
            chooser = Intent.createChooser(i, "Choose Application for Maps");
            startActivity(chooser);
        }
    }
}
