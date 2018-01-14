package com.example.placeapi.pojo.placedetails;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 9:55 PM
 */
public class PlaceDetailsResult {
    @SerializedName("result")
    PlaceDetails result;

    public PlaceDetails getResult() {
        return result;
    }
}
