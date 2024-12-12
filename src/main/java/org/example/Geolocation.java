package org.example;
import com.google.gson.Gson;

public class Geolocation {
   private String type;
   private long[] coordinates;


    @Override
    public String toString() {
        return super.toString();
    }

    public long[] getCoordinates() {
        return coordinates;
    }

    public String getType() {
        return type;
    }
}
