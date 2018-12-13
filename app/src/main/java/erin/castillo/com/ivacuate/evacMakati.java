package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacMakati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_makati);
    }
    public void evacmakati(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.picBangkal) {
            i = new Intent(this, bangkalhall.class);
            startActivity(i);
        } else if (v.getId() == R.id.picUnivMakati) {
            i = new Intent(this, uMak.class);
            startActivity(i);
        }
    }
}
