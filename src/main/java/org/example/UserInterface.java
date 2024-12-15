package org.example;

import com.google.gson.Gson;

import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {

    public Meteorite[] optionOne() {
        try {
            FileReader reader = new FileReader("NASA_Meteorite.json");
            Gson gson = new Gson();
            return gson.fromJson(reader, Meteorite[].class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void optionTwo(Meteorite[] meteorites) {
        System.out.println(Arrays.toString(meteorites));
    }

    public void optionThree(Meteorite[] meteorites) {
        try {
            FileOutputStream fos = new FileOutputStream("saveFile");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(meteorites);
            System.out.println("\n*.*.*.*MISSION COMPLETE*.*.*.*");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void optionFour(Meteorite[] meteorites) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("\nEnter the name of the meteorite: ");
        String meteoriteName = userInput.nextLine().toUpperCase();
        for (Meteorite meteorite : meteorites) {
            if (meteorite.getName().toUpperCase().equals(meteoriteName)) {
               System.out.println(meteorite.display());
               break;
            }
        }
    }

    public void go()  {
        Meteorite[] meteorites = null;

        int choice;
        do {
            choice = getUserOption();

            switch (choice) {
                case 0:
                    System.out.println("0) Quit");
                    break;
                case 1:
                    meteorites = optionOne();
                    break;
                case 2:
                    optionTwo(meteorites);
                    break;
                case 3:
                    optionThree(meteorites);
                    break;
                case 4:
                    optionFour(meteorites);
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
    }

    private int getUserOption() {
        Scanner in = new Scanner(System.in);

        System.out.println("\n\nWelcome ot the NASA Meteorite tracking database.\n");
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

        return in.nextInt();
    }

}
