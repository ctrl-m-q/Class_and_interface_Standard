package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
    //Encapsulation of data by accessor methods
    public static final long serialVersionUID = 1L;
    private final String Name;
    private final String Surname;
    private final char Sex;
    private final Integer Age;
    private final float height;
    private final String Country;
    private final String DateOfBirth;

    public Person(String name, String surname, char sex, Integer age, float height, String country, String dateOfBirth) {
        this.Name = name;
        this.Surname = surname;
        this.Sex = sex;
        this.Age = age;
        this.height = height;
        this.Country = country;
        this.DateOfBirth = dateOfBirth;
    }
    /* This method returns the value of
    all the specified fields in this class */

    @Override
    public String toString() {
        return
                "Name: " +
                        Name
                        + '\n'
                        +
                        " Surname: "
                        + Surname
                        + '\n'
                        +
                        "Sex: "
                        +
                        Sex
                        + '\n' +
                        "Age: "
                        + Age
                        + '\n' + "Height: "
                        + height
                        + '\n' + "Country: "
                        + Country
                        + '\n' +
                        "DateOfBirth: "
                        + DateOfBirth;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public char getSex() {
        return Sex;
    }

    public String getDateOfBirth() {
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

    private void writeObject(ObjectOutputStream OUTSTR) throws IOException {
        OUTSTR.defaultWriteObject();

    }

    private void readObject(ObjectInputStream INSTR) throws IOException, ClassNotFoundException {

        INSTR.defaultReadObject();

    }


}

