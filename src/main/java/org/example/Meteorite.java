package org.example;

public class Meteorite {
    private String name;
    private int id;
    private String nametype;
    private String recclass;
    private double mass;
    private String fall;
    private int year;
    private long reclat;
    private long reclong;
    private Geolocation geolocation;


   public String display (String name, int id, String recclass, double mass, int year) {
       String result = " ";

       return result;
   }
    @Override
    public String toString() {
        return super.toString();
    }

    public int getYear() {
        return year;
    }

    public long getReclat() {
        return reclat;
    }

    public String getRecclass() {
        return recclass;
    }

    public long getreclong() {
        return reclong;
    }

    public String getNametype() {
        return nametype;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public int getId() {
        return id;
    }

    public String getFall() {
        return fall;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }
}
