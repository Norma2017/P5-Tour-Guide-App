package com.example.android.p5_tourguideterceiraisland;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;



/**
 * {@link Fragment}that displays a list of beaches.
 */

public class BeachFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attractions> attractions = new ArrayList<Attractions>();

        attractions.add(new Attractions(R.drawable.negritopiscinas,getString(R.string.experience5_name),getString(R.string.Negrito_Bathing)));
        attractions.add(new Attractions(R.drawable.salga,getString(R.string.experience6_name),getString(R.string.Salga_Bathing)));
        attractions.add(new Attractions(R.drawable.prainha,getString(R.string.experience7_name),getString(R.string.Prainha_Bathing)));
        attractions.add(new Attractions(R.drawable.biscoitos,getString(R.string.experience8_name),getString(R.string.Biscoitos_Bathing)));
        attractions.add(new Attractions(R.drawable.quatroribeiraspiscinas,getString(R.string.experience9_name),getString(R.string.Quatro_Ribeiras)));

        // Create an {@link AttractionsAdapter} object, whose data source is a list of
        //  {@link Attractions}. The adapter knows how to create list item  for each item
        // in the list.
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(),attractions, R.color.category_beach);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attractions_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attractions} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}

