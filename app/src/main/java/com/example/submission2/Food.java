package com.example.submission2;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Collection;

public class Food implements Parcelable {
    private String Name;

    private String details;

    private int Photo;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Name);
        dest.writeString(this.details);
        dest.writeInt(this.Photo);
    }

    public Food() {
    }

    protected Food(Parcel in) {
        this.Name = in.readString();
        this.details = in.readString();
        this.Photo = in.readInt();
    }

    public static final Parcelable.Creator<Food> CREATOR = new Parcelable.Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel source) {
            return new Food(source);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };
}
