package com.example.placeapi.pojo.placedetails;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 8:09 PM
 */
public class Geometry {
    @SerializedName("location")
    Location location;

    public Location getLocation() {
        return location;
    }
}
