package org.example;

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
               + "year = " + getYear();
   }
    @Override
    public String toString() {
        return "\nName: " + name + ", " +
                " \nID: " + id + ", " + "\n"
                + "Nametype: " + nametype + ", " + "\n"
                + "Recclass: " + recclass + ", " + "\n"
                + "Mass: " + mass + ", " + "\n"
                + "Fall: " + fall + ", " + "\n"
                + "Year: " + getYear() + ", " + "\n"
                + "Reclat: " + reclat + ", " + "\n"
                + "Reclong: " + reclong + ", " + "\n"
                + "Geolocation: {" + geolocation + "\n";
    }

    public int getYear() {
        return timestampStringToInt(year);
    }

    private int timestampStringToInt(String yearStr) {
        String timeStamp = yearStr != null ? yearStr : "";
        String[] timeStampArr = timeStamp.split("-");

        int year = 0;
        try {
            year = Integer.valueOf(timeStampArr[0]);
        } catch (NumberFormatException e) { }

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
