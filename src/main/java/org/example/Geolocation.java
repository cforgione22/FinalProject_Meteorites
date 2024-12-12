package org.example;

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
