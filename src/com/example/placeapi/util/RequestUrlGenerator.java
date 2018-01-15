package com.example.placeapi.util;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 3:00 PM
 */
public class RequestUrlGenerator {
    private static final String RADAR_SEARCH_BASE_URL = "https://maps.googleapis.com/maps/api/place/radarsearch";
    private static final String PLACE_DETAILS_BASE_URL = "https://maps.googleapis.com/maps/api/place/details";
    private static final String OUTPUT = "json";
    private static final String API_KEY = "AIzaSyBMj_OJ4zKry6U0SCdTEIsAuCk0N3QAGC4";
    private static final String TYPE = "restaurant";

    public static String getRadarSearchUrl(double Lat, double Long, int radius) {
        return RADAR_SEARCH_BASE_URL + "/" + OUTPUT + "?" + "location=" + Lat + "," + Long
                + "&" + "radius=" + radius + "&" + "type=" + TYPE + "&" + "key=" + API_KEY;
    }

    public static String getPlaceDetailsUrl(String placeId) {
        return PLACE_DETAILS_BASE_URL + "/" + OUTPUT + "?" + "placeid=" + placeId + "&" + "key=" + API_KEY;
    }
}
