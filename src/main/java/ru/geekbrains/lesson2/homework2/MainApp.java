package ru.geekbrains.lesson2.homework2;

import java.util.Scanner;

public class MainApp {  public static void main(String[] args) {

   numberInTheRange();
   integerCheck();
   negativNumber();
   textPrint();
   leapYear();
}

    public static boolean numberInTheRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а и b");
        int a = sc.nextInt();
        int b = sc.nextInt();
           boolean result=((a + b) >= 10 && (a + b) <= 20);
           System.out.println(result);
        return result;


    }

    public static void integerCheck() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число i");
        int i = scan.nextInt();
        if (i >= 0) {
            System.out.println("Число i - положительное");
        } else {
            System.out.println("Число i - отрицательное");
        }
    }

    public static boolean negativNumber() {
        Scanner as = new Scanner(System.in);
        System.out.println("Введите целое число j");
        int j = as.nextInt();
        boolean c = j<0;
        System.out.println(c);
        return c;
    }


    public static void textPrint() {
        Scanner g = new Scanner(System.in);
        System.out.println("Введите текст");
        String str=g.nextLine();
        System.out.println("Введите целое число");
        int n = g.nextInt();
        int i = 0;
        while (i<n) {
            System.out.println(str);i++;
        }
    }


    public static boolean leapYear() {
        System.out.println("Введите год");
        Scanner y = new Scanner(System.in);
        int year = y.nextInt();
        boolean c = year%400==0 && year%100==0 && year%4==0;
        System.out.println(c);
        return c;

    }}
