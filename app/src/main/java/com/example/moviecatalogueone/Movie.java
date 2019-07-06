package com.example.moviecatalogueone;


import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String name;
    private String description;
    private int image;
    private int star;
    private float rating;

    protected Movie(Parcel in) {
        name = in.readString();
        description = in.readString();
        image = in.readInt();
        star = in.readInt();
        rating = in.readFloat();
    }

    public Movie(String name, String s, int poster_aquaman, int star, float v){
            this.name = name;
            this.description = description;
            this.image = image;
            this.star = this.star;
            this.rating = rating;

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeInt(image);
        dest.writeInt(star);
        dest.writeFloat(rating);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }




}
