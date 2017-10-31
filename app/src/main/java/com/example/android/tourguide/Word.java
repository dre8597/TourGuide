package com.example.android.tourguide;

/**
 * Created by demondrelivingston on 8/30/17.
 */

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mObject;
    private String mDescription;
    private int mimageResourceId = NO_IMAGE_PROVIDED;

    public Word(String object, String description, int imageResourceId) {
        mObject = object;
        mDescription = description;
        mimageResourceId = imageResourceId;
    }

    //retrieves the default language of the device being used
    public String getmDefaultTranslation() {
        return mObject;
    }

    //returns the language currently being used into miwok
    public String getmMiwokTranslation() {
        return mDescription;
    }

    public int getimageResourceId() {
        return mimageResourceId;
    }

    public boolean hasImage() {
        return mimageResourceId != NO_IMAGE_PROVIDED;
    }
}


