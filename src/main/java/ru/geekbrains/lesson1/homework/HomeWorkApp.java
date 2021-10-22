package ru.geekbrains.lesson1.homework;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWorlds();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWorlds() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

   public static void checkSumSign() {
        int a = 2;
        int b = 3;
        if ((a+b)>=0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }


       }



    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Крысный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }
    public static void compareNumbers(){
    int a =10;
    int b = 5;
    if(a>=b){
        System.out.println("a>=b");
    }else {System.out.println("a<b");}
}
    }




