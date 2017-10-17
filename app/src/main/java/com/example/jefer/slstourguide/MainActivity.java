package com.example.jefer.slstourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the activities category
        TextView activities = (TextView) findViewById(R.id.activities);

        // Set a click listener on that View
        activities.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activities}
                Intent activitiesIntent = new Intent(MainActivity.this, Activities.class);

                // Start the new activity
                startActivity(activitiesIntent);
            }
        });

        // Find the View that shows the attractions category
        TextView attractions = (TextView) findViewById(R.id.attractions);

        // Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AttractionsActivity}
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionActivity.class);

                // Start the new activity
                startActivity(attractionsIntent);
            }
        });

        // Find the View that shows the food category
        TextView food = (TextView) findViewById(R.id.food);

        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // Find the View that shows the shop category
        TextView shop = (TextView) findViewById(R.id.shop);

        // Set a click listener on that View
        shop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShopActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, ShopActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
}