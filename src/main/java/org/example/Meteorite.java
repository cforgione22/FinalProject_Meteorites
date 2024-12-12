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
    private double reclat;
    private double reclong;
    private Geolocation geolocation;


   public String display (String name, int id, String recclass, double mass, String year) {
       String result = " ";

       return result;
   }
    @Override
    public String toString() {
        return "\nname: " + name + ", " +
                " \nid: " + id + ", " + "\n"
                + "nametype: " + nametype + ", " + "\n"
                + "recclass: " + recclass + ", " + "\n"
                + "mass: " + mass + ", " + "\n"
                + "fall: " + fall + ", " + "\n"
                + "year: " + year + ", " + "\n"
                + "reclat: " + reclat + ", " + "\n"
                + "reclong: " + reclong + ", " + "\n"
                + "geolocation: {" + geolocation + "\n";
    }

    public String getYear() {
        return year;
    }

    public double getReclat() {
        return reclat;
    }

    public String getRecclass() {
        return recclass;
    }

    public double getReclong() {
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
