package com.example.jefer.slstourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of Shopping places
        final ArrayList<Local> locals = new ArrayList<Local>();
        locals.add(new Local(getString(R.string.klasen), getString(R.string.klasen_des),
                R.drawable.klasen));
        locals.add(new Local(getString(R.string.pompeia), getString(R.string.pompeia_des),
                R.drawable.pompeia));
        locals.add(new Local(getString(R.string.casa_das_novidades), getString(R.string.
                casa_das_novidades_des), R.drawable.novidades));
        locals.add(new Local(getString(R.string.boticario), getString(R.string.boticario_des),
                R.drawable.boticario));
        locals.add(new Local(getString(R.string.delta_sul), getString(R.string.delta_des),
                R.drawable.delta));

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