package com.taehyuk.earthquake;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Earthquake {

    //밑에는 변수 선언
    private String mId;
    private Date mDate;
    private String mDetails;
    private Location mLocation;
    private double mMagnitude;
    private  String mLink;

    //밑에는 리턴하는 함수 선언
    public  String getId() {return mId; }
    public  Date getDate() {return mDate; }
    public  String getDetails() {return mDetails; }
    public  Location getLocation() {return mLocation; }
    public  double getMagnitude() {return mMagnitude; }
    public  String getLink() { return  mLink; }

    //밑에는 생성자 만들기
    public Earthquake(String id, Date date, String details, Location location, double magnitude, String link) {

        mId = id;
        mDate = date;
        mDetails = details;
        mLocation = location;
        mMagnitude = magnitude;
        mLink = link;
    }

    @NonNull
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH.mm", Locale.US);
        String dateString = sdf.format(mDate);
        return dateString + ": " + mMagnitude + " " + mDetails;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if ( obj instanceof Earthquake) {
            return (((Earthquake) obj).getId().contentEquals(mId));
        } else {
            return false;
        }
    }
}
