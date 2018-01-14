package com.example.placeapi.pojo.placedetails;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 9:49 PM
 */
public class Period {
    @SerializedName("close")
    DayTime close;
    @SerializedName("open")
    DayTime open;

    public DayTime getClose() {
        return close;
    }

    public DayTime getOpen() {
        return open;
    }
}
