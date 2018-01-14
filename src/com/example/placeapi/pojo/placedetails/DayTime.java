package com.example.placeapi.pojo.placedetails;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 5:04 PM
 */
public class DayTime {
    @SerializedName("day")
    int day; //Day of week int
    @SerializedName("time")
    String time; //24 hour format Like 1200 for 12:00 PM

    public int getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }
}
