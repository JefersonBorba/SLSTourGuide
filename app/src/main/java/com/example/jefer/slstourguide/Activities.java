package com.example.jefer.slstourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Activities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of places
        final ArrayList<Local> locals = new ArrayList<Local>();
        locals.add(new Local(getString(R.string.public_library), getString(R.string.library_des),
                R.drawable.biblio));
        locals.add(new Local(getString(R.string.bola_na_rede), getString(R.string.bola_des),
                R.drawable.bola));
        locals.add(new Local(getString(R.string.armazem), getString(R.string.armazem_des),
                R.drawable.armazem));
        locals.add(new Local(getString(R.string.caminho_pomerano), getString(R.string.pomerano_des),
                R.drawable.pomerano));
        // Create an {@link LocalAdapter}, whose data source is a list of {@link Local}. The
        // adapter knows how to create list items for each item in the list.
        LocalAdapter adapter = new LocalAdapter(this, locals, R.color.menu_color);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.places);

        // Make the {@link ListView} use the {@link LocalAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Local} in the list.
        listView.setAdapter(adapter);
}}
