package erin.castillo.com.ivacuate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class evacManila extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evac_manila);
    }
    public void evacmanila(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.picUST) {
            i = new Intent(this, ust.class);
            startActivity(i);
        } else if (v.getId() == R.id.omgviii) {
            i = new Intent(this, corazon.class);
            startActivity(i);
        }
    }
}
