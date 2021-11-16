package ru.geekbrains.lesson7.homework7;

public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Barsik", 100, false),
                new Cat("Myrzik", 200, false),
                new Cat("Vaska", 50, false)};

        Plate[] plate = {
                new Plate(150),
                new Plate(120),
                new Plate(170),
        };

        Plate plateOne = new Plate(70);


        catEatFromPlate(cat, plate);
        System.out.println();

        catEatFromPlateOne(cat, plateOne);
        System.out.println();

        catAddEatFromPlate(cat, plate);
    }

    public static void catEatFromPlateOne(Cat[] cat, Plate plateOne) {
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plateOne);
        }
    }

    public static void catEatFromPlate(Cat[] cat, Plate[] plate) {
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate[i]);

        }
    }


    public static void catAddEatFromPlate(Cat[] cat, Plate[] plate) {
        for (int i = 0; i < cat.length; i++) {
            cat[i].addEatCat(plate[i]);


        }
    }
}










