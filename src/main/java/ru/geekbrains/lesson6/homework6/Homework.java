package ru.geekbrains.lesson6.homework6;


public class Homework {


    public static void main(String[] args) {

        Animals[] animals = {
                new Dog("Bobik", 250),
                new Dog("Tuzik", 300),
                new Cat("Timofey", 300),
                new Dog("Feliks", 170),
                new Cat("Barsik", 130),
                new Cat("Myrzik", 220),
                new Dog("Admiral", 150),
        };
        checkDistance(animals);
        counterAnimals(animals);
    }

    public static void checkDistance(Animals[] animals) {
        int distanceRunDog = 250;
        int distanceRunCat = 150;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                ((Cat) animals[i]).run(animals[i].distance);
                {
                    if (animals[i].distance <= distanceRunCat) {
                        System.out.println("Кот " + animals[i].name + " пробежал "
                                + animals[i].distance + "м.");
                    } else {
                        System.out.println("Кот " + animals[i].name + " не смог пробежать "
                                + animals[i].distance + " м.");
                    }
                }
            } else if (animals[i].distance <= distanceRunDog) {
                System.out.println("Собака " + animals[i].name + " пробежала "
                        + animals[i].distance + " м.");
            } else {
                System.out.println("Собака " + animals[i].name + " не смогла пробежать "
                        + animals[i].distance + " м.");
            }
        }
        System.out.println();
        int distanceSwim = 270;
        for (int j = 0; j < animals.length; j++) {
            if (animals[j].distance < distanceSwim) {
                if (animals[j] instanceof Cat) {
                    ((Cat) animals[j]).swim(animals[j].distance);
                    System.out.println("Кот " + animals[j].name + " не плаваeт");
                } else if (animals[j] instanceof Dog) {
                    ((Dog) animals[j]).swim(animals[j].distance);
                    System.out.println("Собака " + animals[j].name + " проплыла "
                            + animals[j].distance + " м.");
                }
            } else {
                System.out.println("Собака " + animals[j].name + " не смогла проплыть "
                        + animals[j].distance + " м.");
            }
        }
        System.out.println();

    }


    public static void counterAnimals(Animals[] animals) {
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








