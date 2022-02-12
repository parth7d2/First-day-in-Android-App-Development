package com.example.android.miwok;

public class Word {

    private String mDefaultTranlation;
    private String mMinwokTranlation;

    public Word(String defaultTranlation, String minwokTranlation)
    {
        mDefaultTranlation = defaultTranlation;
        mMinwokTranlation = minwokTranlation;
    }

    public String getmDefaultTranlation()
    {
        return mDefaultTranlation;
    }

    public String getmMinwokTranlation()
    {
        return mMinwokTranlation;
    }
}
