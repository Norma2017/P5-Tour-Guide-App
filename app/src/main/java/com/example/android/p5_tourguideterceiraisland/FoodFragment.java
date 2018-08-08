package com.example.android.p5_tourguideterceiraisland;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment}that displays a list of foods.
 */


public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attractions> attractions = new ArrayList<Attractions>();

        attractions.add(new Attractions(R.drawable.comidamar,getString(R.string.experience14_name),getString(R.string.Sea_food)));
        attractions.add(new Attractions(R.drawable.vinhoverde,getString(R.string.experience15_name),getString(R.string.Wine)));
        attractions.add(new Attractions(R.drawable.alcatra,getString(R.string.experience16_name),getString(R.string.Beef)));
        attractions.add(new Attractions(R.drawable.sopaportuguesa,getString(R.string.experience17_name),getString(R.string.Soups_and_stews)));
        attractions.add(new Attractions(R.drawable.carbs,getString(R.string.experience18_name),getString(R.string.Carbs)));

        // Create an Attractions Adapter, whose data source is a list of
        //  Attraction. The adapter knows how to create list item views for each item
        // in the list.
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(),attractions, R.color.category_food);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attractions} in the list.
        listView.setAdapter(adapter);


        return rootView;


    }
}

