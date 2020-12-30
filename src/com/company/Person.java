package com.company;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private final String Name ;
    private final String Surname;
    private final char Sex;
    private final int Age;
    private final float height;
    private final String Country;
    private final Date DateOfBirth;

    public Person(String name, String surname, char sex, int age, float height, String country, Date dateOfBirth) {
        Name = name;
        Surname = surname;
        Sex = sex;
        Age = age;
        this.height = height;
        Country = country;
        DateOfBirth = dateOfBirth;
    }


    public String getName() {
        return Name;
    }

    public String getSurname(){
        return Surname;
    }

    public char getSex() {
        return Sex;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }


    public float getHeight() {
        return height;
    }


    public int getAge() {
        return Age;
    }

    public String getCountry() {
        return Country;
    }


    public static Person valueOf(String name, String Surname){
        return (name, Surname)
    }


}

