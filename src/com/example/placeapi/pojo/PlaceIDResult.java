package com.example.placeapi.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 2:27 PM
 */
public class PlaceIDResult {
    @SerializedName("results")
    List<PlaceID> placeIDs;

    public List<PlaceID> getPlaceIDs() {
        return placeIDs;
    }
}
