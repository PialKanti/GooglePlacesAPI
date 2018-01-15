package com.example.placeapi;

import com.example.placeapi.http.HttpService;
import com.example.placeapi.pojo.placeid.PlaceID;
import com.example.placeapi.pojo.placeid.PlaceIDResult;
import com.example.placeapi.util.RequestUrlGenerator;
import com.google.gson.Gson;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/14/2018
 * Time: 2:25 PM
 */
public class PlaceIDGenerator {
    private static Set<String> resultIDs;

    public static void main(String[] args) {
        try {
            resultIDs = new HashSet<>();
            File file = new File("inputFile/latlong.txt");
            Scanner in = new Scanner(file);
            int count = 0;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] latlong = line.split(" ");
                String json = HttpService.readUrl(RequestUrlGenerator.getRadarSearchUrl(Double.valueOf(latlong[0]), Double.valueOf(latlong[1]), 1000));
                Gson gson = new Gson();
                PlaceIDResult result = gson.fromJson(json, PlaceIDResult.class);
                count += result.getPlaceIDs().size();
                System.out.println(result.getPlaceIDs().size()); //Todo remove
                for (PlaceID id : result.getPlaceIDs()) {
                    if (!resultIDs.contains(id.getPlaceID())) {
                        resultIDs.add(id.getPlaceID());
                    }
                }
            }
            PrintWriter pw = new PrintWriter("outputFile/placeIDs.txt");
            System.out.println(count); //todo remove
            System.out.println(resultIDs.size()); //Todo remove
            for (String id : resultIDs) {
                pw.println(id);
            }
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
