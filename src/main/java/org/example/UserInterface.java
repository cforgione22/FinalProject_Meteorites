package org.example;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class UserInterface  {



    public void go () {

        {
            try {
                FileReader reader = new FileReader("NASA_Meteorite.json");
                Gson gson = new Gson();
                Meteorite[] meteorites = gson.fromJson(reader, Meteorite[].class);
                System.out.println(Arrays.toString(meteorites));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);

            }
        }

    }
}
