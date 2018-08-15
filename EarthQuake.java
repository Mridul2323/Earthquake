package com.example.android.quakereport;

public class EarthQuake {
    private String mMagnitude;
    private String mLocation;
    private String mtime;

    public EarthQuake(String magnitude,String location,String time){
        mMagnitude=magnitude;
        mLocation=location;
        mtime=time;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mtime;
    }
}
