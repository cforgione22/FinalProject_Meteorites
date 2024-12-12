package org.example;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {


    public void go() {

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

    public int menu() {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\nWelcome ot the NASA Metorite treacking database.\n");
            System.out.println("0) Quit");
            System.out.println("1) Import data from a JSON file");
            System.out.println("2) Display the meteorite data");
            System.out.println("3) Export the meteorite data to a file");
            System.out.println("4) Find a meteorite by name");
            System.out.println("5) Fina a meteorite by ID");
            System.out.println("6) List the largest meteorite");
            System.out.println("7) List the most recent meteorites by year");
            System.out.println("8) List the meteorite classes");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("0) Quit");
                    break;
                case 1:
                    System.out.println("1) Import data from a JSON file");
                    break;
                case 2:
                    System.out.println("2) Display the meteorite data");
                    break;
                case 3:
                    System.out.println("3) Export the meteorite data to a file");
                    break;
                case 4:
                    System.out.println("4) Find a meteorite by name");
                    break;
                case 5:
                    System.out.println("5) Fina a meteorite by ID");
                    break;
                case 6:
                    System.out.println("6) List the largest meteorite");
                    break;
                case 7:
                    System.out.println("7) List the most recent meteorites by year");
                    break;
                case 8:
                    System.out.println("8) List the meteorite Classes");
                    break;
                default:
                    System.out.println("\n...Try again");

            }

        } while (choice > 0 || choice <= 8 );
        return choice;
    }
}
