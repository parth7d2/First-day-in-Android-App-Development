package com.example.project_10a;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("7.2", "San Francisco", "feb 2, 2022"));
        earthquakes.add(new Earthquake("7.2", "London", "feb 2, 2022"));
        earthquakes.add(new Earthquake("7.2", "Tokyo", "feb 2, 2022"));
        earthquakes.add(new Earthquake("7.2", "Mexico City", "feb 2, 2022"));
        earthquakes.add(new Earthquake("7.2", "Moscow", "feb 2, 2022"));
        earthquakes.add(new Earthquake("7.2", "Rio de Janeiro", "feb 2, 2022"));
        earthquakes.add(new Earthquake("7.2", "Paris", "feb 2, 2022"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}