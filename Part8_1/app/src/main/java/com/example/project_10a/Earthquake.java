package com.example.project_10a;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mData;

    public Earthquake(String magnitude, String location, String date)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mData = date;
    }

    public String getmMagnitude()
    {
        return mMagnitude;
    }

    public String getLocation()
    {
        return mLocation;
    }

    public String getData()
    {
        return mData;
    }
}
