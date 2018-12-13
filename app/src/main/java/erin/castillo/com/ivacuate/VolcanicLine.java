package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VolcanicLine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volcanicline);
        setTitle("Volcanic Eruption Hotlines");
}
    public void volcanic (View v){

        if (v.getId()==R.id.callPhivolcsvol){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:4261468"));
            startActivity(intent);
        }
        else if (v.getId()==R.id.callNDRMMCvol){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:9111406"));
            startActivity(intent);
        }
        else if (v.getId()==R.id.callRedvol){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:143"));
            startActivity(intent);
        }
    }
}
