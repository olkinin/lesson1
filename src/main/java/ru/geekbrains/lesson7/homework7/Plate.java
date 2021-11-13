package ru.geekbrains.lesson7.homework7;

public class Plate {


    protected int food;

    public Plate(int food) {
        this.food = food;

    }

    public int descreasePlate(int i) {
        food -= i;
        return food;

    }

}

