package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_VALUE;
    private int mAudioResourceId = NO_IMAGE_VALUE;
    private static  final  int NO_IMAGE_VALUE = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = resourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int resourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = resourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getmResourcecId(){ return mImageResourceId; }
    public int getmAudioResourceId(){ return mAudioResourceId; }
    public boolean hasImage(){ return mImageResourceId != NO_IMAGE_VALUE; }
    public boolean hasAudio(){ return mAudioResourceId != NO_IMAGE_VALUE; }
}
