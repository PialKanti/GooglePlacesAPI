package com.example.placeapi.pojo.placedetails;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 4:56 PM
 */
public class PlaceDetails {
    @SerializedName("name")
    String name;
    @SerializedName("formatted_address")
    String address;
    @SerializedName("formatted_phone_number")
    String phoneNumber;
    @SerializedName("geometry")
    Geometry geometry;
    @SerializedName("opening_hours")
    OpeningHours hours;
    @SerializedName("place_id")
    String placeId;
    @SerializedName("rating")
    Double rating;
    @SerializedName("types")
    ArrayList<String> types;
    @SerializedName("url")
    String url;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public OpeningHours getOpeningHours() {
        return hours;
    }

    public String getPlaceId() {
        return placeId;
    }

    public Double getRating() {
        return rating;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public String getUrl() {
        return url;
    }
}
