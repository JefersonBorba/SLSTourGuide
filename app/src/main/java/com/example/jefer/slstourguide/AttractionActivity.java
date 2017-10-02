package com.example.jefer.slstourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jefer on 9/30/2017.
 */

public class AttractionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of words
        final ArrayList<Local> locals = new ArrayList<Local>();


        // Create an {@link LocalAdapter}, whose data source is a list of {@link Local}s. The
        // adapter knows how to create list items for each item in the list.
        LocalAdapter adapter = new LocalAdapter(this, locals, R.color.category_attraction);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.places);

        // Make the {@link ListView} use the {@link LocalAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Local} in the list.
        listView.setAdapter(adapter);
    }}
