package ru.geekbrains.lesson6.homework6;

public class Animals {

    protected String name;
    protected int distance;


    public Animals(String name) {
        this.name = name;

    }



    public void run(int distance) {


    }
    public void swim(int distance) {
    }

    public static void counter(Animals[] animals) {
        int i;
        int j;
        int countDog = 0;
        int countCat = 0;
        for (i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog) {
                countDog++;

            } else if (animals[i] instanceof Cat) {
                countCat++;
            }
        }
        System.out.println("Собак-" + countDog + ". Котов -"
                + countCat + ". Животных-" + (countCat +
                countDog));

    }

    }

