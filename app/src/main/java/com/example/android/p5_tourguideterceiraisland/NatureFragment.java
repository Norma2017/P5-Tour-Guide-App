package com.example.android.p5_tourguideterceiraisland;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


/**
 * {@link Fragment}that display a list of nature attractions.
 */

public class NatureFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attractions> attractions = new ArrayList<Attractions>();

        attractions.add(new Attractions(R.drawable.birdswatching,getString(R.string.experiences1_name),getString(R.string.experiences1_description)));
        attractions.add(new Attractions(R.drawable.whalewatching,getString(R.string.experience2_name),getString(R.string.Whalet_Watching)));
        attractions.add(new Attractions(R.drawable.trails,getString(R.string.experience3_name),getString(R.string.Walking_Trails)));
        attractions.add(new Attractions(R.drawable.diving,getString(R.string.experience4_name),getString(R.string.Diving)));

        // Create an {@link AttractionsAdapter} object, whose data source is a list of
        //  {@link Attractions}. The adapter knows how to create list item  for each item
        // in the list.
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(),attractions, R.color.category_nature);

        // Get a reference to the ListView, and attach the adapter to the listView.
        // There should be a {@link ListView} with the ID called list, which is declared in the
        // attractions_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attractions} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }
}

