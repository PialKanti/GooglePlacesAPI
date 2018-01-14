package com.example.placeapi.pojo.placedetails;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 4:59 PM
 */
public class Location {
    @SerializedName("lat")
    Double Lat;
    @SerializedName("lng")
    Double Long;

    public Double getLat() {
        return Lat;
    }

    public Double getLong() {
        return Long;
    }
}
