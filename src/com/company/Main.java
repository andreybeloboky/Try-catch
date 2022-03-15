package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NegativeArrayException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number cat(s)");
            int catNumber = scanner.nextInt();
            System.out.println("Enter number dog(s)");
            int dogNumber = scanner.nextInt();
            System.out.println("Enter number caw(s)");
            int cowNumber = scanner.nextInt();
            System.out.println("Number cats: " + catNumber);
            System.out.println("Number dogs: " + dogNumber);
            System.out.println("Number caws: " + cowNumber);
            Cat[] cats = new Cat[catNumber];
            Dog[] dogs = new Dog[dogNumber];
            Cow[] cows = new Cow[cowNumber];
            System.out.println("Cat:");
            for (int i = 0; i < catNumber; i++) {
                int catAge = addAge();
                String catName = addAName();
                cats[i] = new Cat(catAge, catName);
            }
            System.out.println("Dog:");
            for (int j = 0; j < dogNumber; j++) {
                int dogAge = addAge();
                String dogName = addAName();
                dogs[j] = new Dog(dogAge, dogName);
            }
            System.out.println("Caw:");
            for (int k = 0; k < cowNumber; k++) {
                int cowAge = addAge();
                String cowName = addAName();
                cows[k] = new Cow(cowAge, cowName);
            }
            Farm farm = new Farm(cats, dogs, cows);
            farm.addCat(new Cat(5, "Alo"));
            int middleAge = farm.calculateMiddleAge();
            System.out.println(middleAge);
            int countAnimals = farm.countAnimals();
            System.out.println(countAnimals);
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
            // throw new NegativeArrayException("All value should be more than 0", e);
            e.initCause(new NegativeArraySizeException("Kek"));
            System.err.println(e.getCause());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            throw new NotNumber("The value must be a number");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Incorrect number");
        }
    }

    public static class NotNumber extends RuntimeException {
        public NotNumber(String message) {
            super(message);
        }
    }

    /**
     * @return - filling cell age array;
     */
    public static int addAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        return scanner.nextInt();
    }

    /**
     * @return - filling cell String array;
     */
    public static String addAName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        return scanner.next();
    }
}

