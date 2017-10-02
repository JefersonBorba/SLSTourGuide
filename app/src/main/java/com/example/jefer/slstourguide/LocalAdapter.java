package com.example.jefer.slstourguide;

/**
 * Created by jefer on 9/30/2017.
 */

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
 * {@link LocalAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Local} objects.
 */
public class LocalAdapter extends ArrayAdapter<Local>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link LocalAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param locals is the list of {@link Local}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public LocalAdapter(Context context, ArrayList<Local> locals, int colorResourceId) {
        super(context, 0, locals);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places_list, parent, false);
        }

        // Get the {@link Local} object located at this position in the list
        Local currentLocal = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID description_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the places descriptions from the currentLocal object and set this text on
        // the Description TextView.
        descriptionTextView.setText(currentLocal.getPlaceDescription());

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the place name from the currentLocal object and set this text on
        // the name TextView.
        nameTextView.setText(currentLocal.getPlaceName());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}