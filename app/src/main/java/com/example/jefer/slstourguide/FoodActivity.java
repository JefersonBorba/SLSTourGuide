package com.example.jefer.slstourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of places
        final ArrayList<Local> locals = new ArrayList<Local>();
        locals.add(new Local(getString(R.string.comilao), getString(R.string.comilão_des),
                R.drawable.comilao));
        locals.add(new Local(getString(R.string.pinz_restaurant), getString(R.string.pinz_des),
                R.drawable.pinz));
        locals.add(new Local(getString(R.string.lourenciano_restaurant), getString(R.string.
                lourenciano_des), R.drawable.lourenciano));
        locals.add(new Local(getString(R.string.free_lanches), getString(R.string.free_lanches_des),
                R.drawable.free));

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
