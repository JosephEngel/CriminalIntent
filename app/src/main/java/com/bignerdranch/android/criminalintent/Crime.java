package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by joey on 11/20/17.
 *
 * Serves as our Model Layer for the Criminal Intent Application
 *
 */

public class Crime {

    private UUID mID;

    private String mTitle;


    public Crime() {

        // Generate unique identifier
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}