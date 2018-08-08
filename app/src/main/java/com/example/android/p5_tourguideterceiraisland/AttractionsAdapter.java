package com.example.android.p5_tourguideterceiraisland;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Norma C Martinez on 24/05/2018
 */

/**
 * {@link AttractionsAdapter}is an {@link ArrayAdapter}that can provide the layout for each list item
 * based on a  data source, which is a list of {@link Attractions} objects.
 */

public class AttractionsAdapter extends ArrayAdapter<Attractions> {

    /** Resource ID for the background color for this list of attractions */
    private int mColorResourceId;

    /**
     * @param context is the current context (i.e. Activity)that the adapter is being created in.
     * @param attractions is the list of {@link Attractions}to be displayed.
     * @param colorResourceId is the resource ID for the background color fot this list of attractions.
     */

    public AttractionsAdapter(Context context, ArrayList<Attractions> attractions, int colorResourceId) {
        super(context, 0,attractions);
        mColorResourceId = colorResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Attractions object located at this position in the list.
        Attractions currentAttractions = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.attraction_image);
        imageView.setImageResource(currentAttractions.getImage());

        // Find the TextView in the list_item.xml layout with the ID title.
        TextView attractionName = listItemView.findViewById(R.id.attraction_name);
        attractionName.setText(currentAttractions.getName());

        // Find the TextView in the list_item.xml layout with the ID attraction description.
        TextView attractionDescription = listItemView.findViewById(R.id.attraction_description);
        // Get the description from the currentAttractions object and set this text on
        attractionDescription.setText(currentAttractions.getDescription());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }




}

