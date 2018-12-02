package erin.castillo.com.ivacuate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FloodLine extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    java.util.List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood_line);
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, java.util.List<String>>();

        // Adding child data
        listDataHeader.add("Philippine Institute of Volcanology and Seismology (PHIVOLCS)");
        listDataHeader.add("National Disaster Risk Reduction and Management Council (NDRRMC)");

        // Adding child data
        java.util.List<String> PHIVOLCS = new ArrayList<String>();
        PHIVOLCS.add("Trunkline: (02) 426-1468 to 79, local 124/125 (Seismology)");

        java.util.List<String> NDRRMC = new ArrayList<String>();
        NDRRMC.add("Operations Center: (02)911-1406, (02)912-2665, (02)912-5668, (02) 911-1873");


        listDataChild.put(listDataHeader.get(0), PHIVOLCS); // Header, Child data
        listDataChild.put(listDataHeader.get(1), NDRRMC); // Header, Child data
    }
}
