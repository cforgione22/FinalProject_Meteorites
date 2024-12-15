package org.example;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Arrays;

public class Geolocation implements Serializable {
   private String type;
   private double[] coordinates;


    @Override
    public String toString() {
        return "\n  Type: " + type + ", " + "\n" +
                " Coordinates: " + Arrays.toString(coordinates) + " }";
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public String getType() {
        return type;
    }
}
