package com.example.placeapi.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 1/15/2018
 * Time: 12:16 PM
 */
public class Splitting {
    public static void main(String[] args) {
        try {
            File input = new File("outputFile/placeIDs.txt");
            Scanner in = new Scanner(input);
            for (int i = 0; i < 6; i++) {
                File file = new File("outputFile/placeId-" + (i + 1) + ".txt");
                try {
                    if (!file.exists())
                        file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                PrintWriter pw = new PrintWriter(file.getPath());
                for (int j = 0; j < 859; j++) {
                    if (j > 0) {
                        pw.println();
                    }
                    pw.print(in.next());
                }
                pw.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
