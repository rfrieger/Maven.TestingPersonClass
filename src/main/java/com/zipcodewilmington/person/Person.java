package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int shoeSize;
    private String eyeColor;
    private String hairColor;
    private int hieghtCm;
    private String lastName;


    public Person() {
        this.name = "";
        this.age = 2147483647;
        this.shoeSize = 12;
        this.eyeColor = "green";
        this.hairColor = "brown";
        this.lastName = "Rieger";
    }


    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int shoeSize, String eyeColor, String hairColor, int hieghtCm, String lastName) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.hieghtCm = hieghtCm;
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setHieghtCm(int hieghtCm) {
        this.hieghtCm = hieghtCm;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {

        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getHieghtCm() {
        return hieghtCm;
    }

    public String getLastName() {
        return lastName;
    }

}