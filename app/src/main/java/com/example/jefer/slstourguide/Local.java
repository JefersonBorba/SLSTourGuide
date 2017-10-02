package com.example.jefer.slstourguide;

/**
 * Created by jefer on 9/30/2017.
 */

/**
 * {@link Local} represent the places where you could go
 */
public class Local {

    /** Place Name */
    private String mPlaceName;

    /** Place Description */
    private String mPlaceDescription;

    /** Image resource ID for the place*/
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param placeName is the name of the place
     * @param placeDescription is the description of the place
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Local(String placeName, String placeDescription, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mImageResourceId = imageResourceId;
    }
    /**
     * Get the place name
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the place description
     */
    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    /**
     * Return the image resource ID of the place
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}