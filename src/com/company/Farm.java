package com.company;

public class Farm {

    private Cat[] cats;
    private Dog[] dogs;
    private Cow[] cows;
    private int totalAgeCats;
    private int totalAgeDogs;
    private int totalAgeCows;

    /**
     * @param cats - array cats from ages and names;
     * @param dogs - array dogs from ages and names;
     * @param caws - array caws from ages and names;
     */
    public Farm(Cat[] cats, Dog[] dogs, Cow[] caws) {
        this.cats = cats;
        this.dogs = dogs;
        this.cows = caws;
        this.totalAgeCats = this.calculateTotalAgeOfCats();
        this.totalAgeDogs = this.calculateTotalAgeOfDogs();
        this.totalAgeCows = this.calculateTotalAgeOfCows();
    }


    public int calculateTotalAgeOfCats() {
        int totalAge = 0;
        for (Cat cat : cats) {
            int age = cat.getAge();
            totalAge +=  age;
        }
        return totalAge;
    }


    public int calculateTotalAgeOfDogs() {
        int totalAge = 0;
        for (Dog dog : dogs) {
            int age = dog.getAge();
            totalAge +=  age;
        }
        return totalAge;
    }


    public int calculateTotalAgeOfCows() {
        int totalAge = 0;
        for (Cow cow : cows) {
            int age = cow.getAge();
            totalAge +=  age;
        }
        return totalAge;
    }

    public void addCat(Cat cat) {
        Cat[] cats1 = new Cat[cats.length + 1];
        for (int i = 0; i < cats.length; i++) {
            cats1[i] = cats[i];
        }
        cats1[cats.length] = cat;


        this.totalAgeCats = calculateTotalAgeOfCats();
    }

    public void addDogs(Dog dog) {
        Dog[] dog1 = new Dog[cats.length + 1];
        for (int i = 0; i < cats.length; i++) {
            dog1[i] = dogs[i];
        }
        dog1[cats.length] = dog;

        this.totalAgeDogs = calculateTotalAgeOfDogs();
    }

    public void addCows(Cow cow) {
        Cow[] cows1 = new Cow[cats.length + 1];
        for (int i = 0; i < cats.length; i++) {
            cows1[i] = cows[i];
        }
        cows1[cats.length] = cow;


        this.totalAgeCows = calculateTotalAgeOfCows();
    }

    public int countAnimals() {
        return cats.length + dogs.length + cows.length;
    }

    public int calculateMiddleAge() {
        return (totalAgeCats + totalAgeDogs + totalAgeCows) / (cats.length + dogs.length + cows.length);
    }
}
