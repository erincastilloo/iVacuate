package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SafetyTips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety_tips);
    }
    public void process1(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.linearearth) {
            i = new Intent(this, DisasterEarthquake.class);
            startActivity(i);
        } else if (v.getId() == R.id.linearflood) {
            i = new Intent(this, DisasterFlood.class);
            startActivity(i);
        } else if (v.getId() == R.id.linearland) {
            i = new Intent(this, DisasterLandslide.class);
            startActivity(i);
        } else if (v.getId() == R.id.linearvolcanic) {
            i = new Intent(this, DisasterVolcanic.class);
            startActivity(i);
        }
    }
}
