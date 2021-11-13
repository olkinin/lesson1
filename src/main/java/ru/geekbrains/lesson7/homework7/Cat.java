package ru.geekbrains.lesson7.homework7;

import com.sun.javaws.jnl.ResourcesDesc;

public class Cat {

    protected String name;
    protected int appetite;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eatCat(Plate p) {
        p.descreasePlate(appetite);



    }

}
