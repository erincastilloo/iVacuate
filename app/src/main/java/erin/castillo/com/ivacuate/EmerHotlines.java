package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmerHotlines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emer_hotlines);
    }
    public void process2 (View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.nationalHotline){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:911"));
            startActivity(intent);
        }
        else if (v.getId()==R.id.earthHotline){
            i = new Intent(this, Earthline.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.landHotline){
            i = new Intent(this, LandLine.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.floodHotline){
            i = new Intent(this, FloodLine.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.volcanicHotline){
            i = new Intent(this, VolcanicLine.class);
            startActivity(i);
        }
    }
}
