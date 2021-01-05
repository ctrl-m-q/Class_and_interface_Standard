package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main extends Thread {

    public static void main(String[] args) {

        String Name;
        String Surname;
        char Sex;
        Integer Age;
        float height;
        String Country;
        String DateOfBirth;

        ArrayList<Person> listofPerson = new ArrayList<Person>();

        for (int i = 0; i < 4; i++) {
            Scanner keypad = new Scanner(System.in);
            System.out.println("Enter Name");
            Name = keypad.nextLine();
            System.out.println("Enter Surname");
            Surname = keypad.nextLine();
            System.out.println("Enter Sex (one character)");
            Sex = keypad.next().charAt(0);
            System.out.println("Enter Age (Number)");
            Age = keypad.nextInt();
            System.out.println("Enter Height");
            height = keypad.nextFloat();
            System.out.println("Enter Country");
            Country = keypad.nextLine();
            System.out.println("Enter Date of Birth");
            DateOfBirth = keypad.nextLine();

            Person person = new Person(Name, Surname, Sex, Age, height, Country, DateOfBirth);
            listofPerson.add(person);
            System.out.println("Hashcode:" + listofPerson.hashCode());

            Scanner userFile = new Scanner(System.in);
            System.out.println("Enter File path: ");
            Threads t1 = new Threads("Serialize");
            t1.start();
            if (userFile.hasNextLine()) {
                //Serialization
                try {
                    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(userFile.nextLine()));
                    os.writeObject(person);
                    os.flush();
                    os.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


    }
}
