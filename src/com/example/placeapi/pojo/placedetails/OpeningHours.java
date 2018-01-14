package com.example.placeapi.pojo.placedetails;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 5:03 PM
 */
public class OpeningHours {
    @SerializedName("periods")
    List<Period> periods;

    public List<Period> getPeriods() {
        return periods;
    }
}
