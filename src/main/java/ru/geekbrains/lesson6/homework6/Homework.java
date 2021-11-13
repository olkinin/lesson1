package ru.geekbrains.lesson6.homework6;

public class Homework {


    public static void main(String[] args) {


       Animals[] animals = {
                new Dog("Tuzik"),
                new Cat("Timofey"),
                new Dog("Feliks"),
                new Cat("Barsik"),
                new Cat("Myrzik"),
                new Dog("Admiral"),
        };
        animals[0].run(300);
        animals[1].swim(300);
        animals[2].swim(170);
        animals[3].run(130);
        animals[4].run(220);
        animals[5].run(150);
        counter(animals);
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








