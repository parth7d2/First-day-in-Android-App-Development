package com.example.android.project_9b;

public class Word {

    private String mDefaultTranlation;
    private String mMinwokTranlation;
    private int mImageResourseId = NO_IMAGE_PROVIDED;
    private int mAudioResourseId;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranlation, String minwokTranlation, int audioResourseId)
    {
        mDefaultTranlation = defaultTranlation;
        mMinwokTranlation = minwokTranlation;
        mAudioResourseId = audioResourseId;
    }

    public Word(String defaultTranlation, String minwokTranlation, int imageResoureseId, int audioResourseId)
    {
        mDefaultTranlation = defaultTranlation;
        mMinwokTranlation = minwokTranlation;
        mImageResourseId = imageResoureseId;
        mAudioResourseId = audioResourseId;

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

    public int getmAudioResourseId(){return mAudioResourseId;}

    public boolean hasImage()
    {
        return mImageResourseId != NO_IMAGE_PROVIDED;
    }
}
