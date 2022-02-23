package com.example.project_10a;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mData;
    private long mTimeInMillisecond;

    public Earthquake(String magnitude, String location, long timeInMilliseconds)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMillisecond = timeInMilliseconds;
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

    public long getTimeInMilliseconds()
    {
        return mTimeInMillisecond;
    }
}
