package com.example.jefer.slstourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of places
        final ArrayList<Local> locals = new ArrayList<Local>();
        locals.add(new Local(getString(R.string.barrinha_beach), getString(R.string.barrinha_des),
                R.drawable.barrinha));
        locals.add(new Local(getString(R.string.nereidas_beach), getString(R.string.nereidas_des),
                R.drawable.nereidas));
        locals.add(new Local(getString(R.string.ondinas_beach), getString(R.string.ondinas_des),
                R.drawable.ondinas));
        locals.add(new Local(getString(R.string.camping), getString(R.string.camping_des),
                R.drawable.camping));
        locals.add(new Local(getString(R.string.dede_square), getString(R.string.dede_des),
                R.drawable.dede));
        locals.add(new Local(getString(R.string.sobrado_farm), getString(R.string.sobrado_des),
                R.drawable.sobrado));

        // Create an {@link LocalAdapter}, whose data source is a list of {@link Local}s. The
        // adapter knows how to create list items for each item in the list.
        LocalAdapter adapter = new LocalAdapter(this, locals, R.color.menu_color);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.places);

        // Make the {@link ListView} use the {@link LocalAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Local} in the list.
        listView.setAdapter(adapter);
    }}
