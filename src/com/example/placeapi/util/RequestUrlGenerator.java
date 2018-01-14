package com.example.placeapi.util;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 3:00 PM
 */
public class RequestUrlGenerator {
    private static final String BASE_URL = "https://maps.googleapis.com/maps/api/place/radarsearch";
    private static final String OUTPUT = "json";
    private static final String API_KEY = "AIzaSyA66LfrFIsu7G2QGoiZqrfH_sgnffDkTRw";
    private static final String TYPE = "restaurant";

    public static String getRadarSearchUrl(double Lat, double Long, int radius) {
        return BASE_URL + "/" + OUTPUT + "?" + "location=" + Lat + "," + Long
                + "&" + "radius=" + radius + "&" + "type=" + TYPE + "&" + "key=" + API_KEY;
    }
}