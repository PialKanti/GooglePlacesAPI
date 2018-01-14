package com.example.placeapi.pojo.placeid;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 2:27 PM
 */
public class PlaceID {
    @SerializedName("place_id")
    String placeID;
    public String getPlaceID() {
        return placeID;
    }
}
