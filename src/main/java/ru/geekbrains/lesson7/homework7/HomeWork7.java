package ru.geekbrains.lesson7.homework7;

import com.sun.corba.se.pept.transport.ReaderThread;

public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Barsik", 100),
                new Cat("Myrzik", 200),
                new Cat("Vaska", 50)};

        Plate[] plate = {
                new Plate(150),
                new Plate(120),
                new Plate(170),
        };
        System.out.println(catAte(cat, plate));
    }

    public static boolean catAte(Cat[] cat, Plate[] plate) {
boolean satiety = false;
        for (int i = 0; i < cat.length; i++) {
            if (plate[i].food < cat[i].appetite) {satiety=false;
                System.out.println(cat[i].name + " еды не хватает ,"+satiety);
                }
            if(plate[i].food >= cat[i].appetite)
                cat[i].eatCat(plate[i]);satiety=true;
                System.out.println("У кота " + cat[i].name + " осталось " + plate[i].food+
                        ", кот сыт ,"+satiety);

                }
        return satiety;

        }
}






