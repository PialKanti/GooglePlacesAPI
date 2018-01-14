package com.example.placeapi;

import com.example.placeapi.http.HttpService;
import com.example.placeapi.pojo.placedetails.FormattedPlaceDetails;
import com.example.placeapi.pojo.placedetails.PlaceDetails;
import com.example.placeapi.pojo.placedetails.PlaceDetailsResult;
import com.example.placeapi.util.RequestUrlGenerator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.json.JSONObject;


import java.io.*;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 8:06 PM
 */
public class PlaceDetailsGenerator {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        try {
            PrintWriter pw = new PrintWriter("outputFile/restaurants.json");
            try {
                // Reading from file
                File file = new File("outputFile/placeIDs.txt");
                Scanner in = new Scanner(file);
                while (in.hasNext()) {
                    String json = HttpService.readUrl(RequestUrlGenerator.getPlaceDetailsUrl(in.next()));
                    GsonBuilder builder = new GsonBuilder();
                    Gson gson = builder.serializeNulls().create();
                    PlaceDetailsResult details = gson.fromJson(json, PlaceDetailsResult.class);
                    // Generating Formatted JSON
                    FormattedPlaceDetails formattedResult = new FormattedPlaceDetails();
                    formattedResult.setName(details.getResult().getName());
                    formattedResult.setAddress(details.getResult().getAddress());
                    formattedResult.setPhoneNumber(details.getResult().getPhoneNumber());
                    formattedResult.setLocation(details.getResult().getGeometry().getLocation());
                    if (details.getResult().getOpeningHours() != null)
                        formattedResult.setPeriods(details.getResult().getOpeningHours().getPeriods());
                    formattedResult.setWeekDays(details.getResult().getWeekDays());
                    formattedResult.setRating(details.getResult().getRating());
                    formattedResult.setTypes(details.getResult().getTypes());
                    formattedResult.setUrl(details.getResult().getUrl());

                    Gson gsonPretty = new GsonBuilder().create();
                    String formattedJson = gsonPretty.toJson(formattedResult);
                    JSONObject object = new JSONObject(formattedJson);
                    jsonObject.put(details.getResult().getName(), object);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            pw.print(jsonObject.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
