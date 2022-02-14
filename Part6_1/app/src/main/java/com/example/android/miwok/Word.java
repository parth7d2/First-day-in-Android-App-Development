package com.example.android.miwok;

public class Word {

    private String mDefaultTranlation;
    private String mMinwokTranlation;
    private int mImageResourseId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranlation, String minwokTranlation)
    {
        mDefaultTranlation = defaultTranlation;
        mMinwokTranlation = minwokTranlation;
    }

    public Word(String defaultTranlation, String minwokTranlation, int imageResoureseId)
    {
        mDefaultTranlation = defaultTranlation;
        mMinwokTranlation = minwokTranlation;
        mImageResourseId = imageResoureseId;
    }

    public String getmDefaultTranlation()
    {
        return mDefaultTranlation;
    }

    public String getmMinwokTranlation()
    {
        return mMinwokTranlation;
    }

    public int getmImageResourseId(){return mImageResourseId;}

    public boolean hasImage()
    {
        return mImageResourseId != NO_IMAGE_PROVIDED;
    }
}
