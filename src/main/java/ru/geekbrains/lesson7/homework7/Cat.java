package ru.geekbrains.lesson7.homework7;

public class Cat {

    protected String name;
    protected int appetite;
    private boolean satiety;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eatCat(Plate p) {
        p.descreasePlate(appetite);
    }


    public boolean eat(Plate plate) {

        if (plate.food < appetite) {
            satiety = false;
            System.out.println(name + " еды не хватает ," + satiety);
        }
        if (plate.food >= appetite) {
            eatCat(plate);
            satiety = true;
            System.out.println("У кота " + name + " осталось " + plate.food +
                    ", кот сыт ," + satiety);
        }
        return satiety;
    }


    public void addEatCat(Plate plate) {
        if (plate.food < appetite) {
            plate.setAddFood();
            {
                if (plate.setAddFood() > appetite) {
                    plate.descreasePlate(appetite);
                    {

                    }
                    System.out.println("У кота " + name + " осталось " + plate.food);
                }
            }


        }
    }
}




