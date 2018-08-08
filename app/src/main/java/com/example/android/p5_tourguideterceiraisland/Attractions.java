package com.example.android.p5_tourguideterceiraisland;

/**
 * {@link Attractions} represents diferent place that the user will be wants to visit.
 * It contains resource IDs for the Attraction ImageResourceId, Attraction Name and Attraction Description.
 */

public class Attractions {

    /** Image is the resource*/
    private int mImageResourceId;

    // Description of Attraction
    private String mDescription;

    // Name is the title of Attraction
    private String mName;



    /** Create a new Attrations object
     *  @param imageResourceId
     * @param description
     * @param name
     */

    public Attractions (int imageResourceId,String name,String description){
        mImageResourceId = imageResourceId;
        mName = name;
        mDescription = description;
    }

    /**
     * Get the int resource ID image of the Attraction
     */

    public int getImage(){
        return mImageResourceId;
    }

    /**
     * Get the String resource ID name of the Attraction
     */
    public String getName(){
        return  mName;
    }

    /**
     * Get the String resource ID description of the Attraction
     */
    public  String getDescription(){
        return mDescription;
    }

}

