package org.example;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UserInterface  {



    public void go () {

        {
            try {
                FileReader reader = new FileReader("NASA_Meteorite.json");
                Gson gson = new Gson();
                Meteorite[] m = gson.fromJson(reader, Meteorite[].class);
                System.out.println(m);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
