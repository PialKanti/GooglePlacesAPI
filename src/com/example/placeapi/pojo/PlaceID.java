package com.example.placeapi.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 2:27 PM
 */
public class PlaceID {
   /* @SerializedName("name")
    String name;*/
    @SerializedName("place_id")
    String placeID;
    public String getPlaceID() {
        return placeID;
    }
}
