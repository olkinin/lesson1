package ru.geekbrains.lesson6.homework6;

public class Dog extends Animals {


    protected Dog(String name) {
        super(name);

    }

    public void run(int distance) {
        this.name = name;
        int distanceRunDog = 200;
        if (distance <= distanceRunDog) {
            System.out.println("Собака " + name + " пробежала "
                    + distance + " м.");
        } else {
            System.out.println("Собака " + name + " не смогла пробежать "
                    + distance + " м.");
        }


    }

    public void swim(int distance) {
        this.name = name;

        int distanceSwim = 270;

        if (distance <= distanceSwim) {

            System.out.println("Собака " + name + " проплыла "
                    + distance + " м.");
        } else {
            System.out.println("Собака " + name + " не смогла проплыть "
                    + distance + " м.");
        }
    }


}














