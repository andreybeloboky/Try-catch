package com.company;

public class Cow {

    private int age;
    private String name;

    /**
     * @param age  - age cow have written user;
     * @param name - name cow have written user;
     */
    public Cow(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * @return - age cow;
     */
    public int getAge() {
        return age;
    }
}
