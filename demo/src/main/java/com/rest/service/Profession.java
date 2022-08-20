package com.rest.service;

public class Profession {
    private String name;
    private int age;
    private String profession;

    public Profession(String name, int age, String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getProfession(){
        return profession;
    }
}
