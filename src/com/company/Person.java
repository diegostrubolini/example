package com.company;

public class Person {

    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getAddress() {
        return "Madero 999";
    }
    
    @Override
    public String toString() {
        return name;
    }
}
