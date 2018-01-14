package com.example.placeapi.pojo.placedetails;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 8:33 PM
 */
public class FormattedPlaceDetails {
    @SerializedName("name")
    String name;
    @SerializedName("address")
    String address;
    @SerializedName("phone_number")
    String phoneNumber;
    @SerializedName("location")
    Location location;
    @SerializedName("periods")
    List<Period> periods;
    @SerializedName("weekday_text")
    List<String> weekDays;
    @SerializedName("rating")
    Double rating;
    @SerializedName("types")
    ArrayList<String> types;
    @SerializedName("url")
    String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    public void setWeekDays(List<String> weekDays) {
        this.weekDays = weekDays;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
