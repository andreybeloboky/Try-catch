package com.company;

public class Dog {

    private int age;
    private String name;

    /**
     * @param age  -age dog have written user;
     * @param name -name dog have written user;
     */
    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * @return - age dog;
     */
    public int getAge() {
        return age;
    }
}
