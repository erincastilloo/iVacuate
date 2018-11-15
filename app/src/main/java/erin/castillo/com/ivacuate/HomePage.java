package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        }
        public void process(View v){
            Intent i = null, chooser=null;
            if (v.getId()==R.id.home_evac){
                i = new Intent(this, EvacCenter.class);
                startActivity(i);
            }
            else if (v.getId()==R.id.home_safety){
                i = new Intent(this, SafetyTips.class);
                startActivity(i);
            }
            else if (v.getId()==R.id.home_live){
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.accuweather.com/en/ph/manila/264885/satellite/264885"));
                chooser = Intent.createChooser(i, "Choose Browser:");
                startActivity(i);
            }
            else if (v.getId()==R.id.home_hotline){
                i = new Intent(this, EmerHotlines.class);
                startActivity(i);
            }
        }
}
