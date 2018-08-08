package com.example.android.p5_tourguideterceiraisland;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment}that displays a list of geosites.
 */

public class GeositesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attractions> attractions = new ArrayList<Attractions>();

        attractions.add(new Attractions(R.drawable.algar,getString(R.string.experience10_name),getString(R.string.Algar_do_Carvão)));
        attractions.add(new Attractions(R.drawable.grutadonatal,getString(R.string.experience11_name),getString(R.string.Gruta_do_Natal)));
        attractions.add(new Attractions(R.drawable.caldeiraguilhermemoniz,getString(R.string.experience12_name),getString(R.string.Caldeira_Guilherme_Moniz)));
        attractions.add(new Attractions(R.drawable.pontadaserreta,getString(R.string.experience13_name),getString(R.string.Ponta_da_Serreta)));

        // Create an Attractions Adapter, whose data source is a list of
        //  Attraction. The adapter knows how to create list item views for each item
        // in the list.
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(),attractions, R.color.category_geosites);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attractions} in the list.
        listView.setAdapter(adapter);


        return rootView;


    }
}
