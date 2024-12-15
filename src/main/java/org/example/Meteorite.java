package org.example;
import com.google.gson.Gson;

import java.io.NotSerializableException;
import java.io.Serializable;

public class Meteorite implements Serializable {
    public String name;
    private int id;
    private String nametype;
    private String recclass;
    private double mass;
    private String fall;
    private String year;
    private double reclat;
    private double reclong;
    private Geolocation geolocation;


   public String display () {
       return "name = " + name + ", "
               + "id = " + id + ", "
               + "recclass = " + recclass + ", "
               + "mass = " + mass + ", "
               + "year = " + year;
   }
    @Override
    public String toString() {
        return "\nName: " + name + ", " +
                " \nID: " + id + ", " + "\n"
                + "Nametype: " + nametype + ", " + "\n"
                + "Recclass: " + recclass + ", " + "\n"
                + "Mass: " + mass + ", " + "\n"
                + "Fall: " + fall + ", " + "\n"
                + "Year: " + year + ", " + "\n"
                + "Reclat: " + reclat + ", " + "\n"
                + "Reclong: " + reclong + ", " + "\n"
                + "Geolocation: {" + geolocation + "\n";
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
