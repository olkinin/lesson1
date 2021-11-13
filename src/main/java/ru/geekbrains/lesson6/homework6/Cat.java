package ru.geekbrains.lesson6.homework6;


public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }


    public void run(int distance) {
        this.name=name;
        int distanceRunCat = 150;
        if (distance <= distanceRunCat) {
            System.out.println("Кот " + name +" пробежал "
                    + distance + " м.");
        } else {
            System.out.println("Кот " +name+" не смог пробежать "
                    + distance + " м.");

        }

    }

    public void swim(int distance) {
        this.name = name;

            System.out.println("Кот " + name + " не плавает");

}

    }



