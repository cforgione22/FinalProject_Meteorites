package org.example;
import com.google.gson.Gson;
public class Meteorite  {
    private String name;
    private int id;
    private String nametype;
    private String recclass;
    private double mass;
    private String fall;
    private String year;
    private long reclat;
    private long reclong;
    private Geolocation geolocation;


   public String display (String name, int id, String recclass, double mass, String year) {
       String result = " ";

       return result;
   }
    @Override
    public String toString() {
        return super.toString();
    }

    public String getYear() {
        return year;
    }

    public long getReclat() {
        return reclat;
    }

    public String getRecclass() {
        return recclass;
    }

    public long getReclong() {
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
