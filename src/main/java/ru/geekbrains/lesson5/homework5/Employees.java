package ru.geekbrains.lesson5.homework5;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Arrays;

public class Employees {

    private int age;
    public String name;
    public String position;
    public String email;
    public String tel;
    public int wage;


    public Person[] arrPerson;


    public static void main(String[] args) {
        new Employees("Ivan Ivanov", "economist",
                "ivanov@yandex.ru", "2552525", 5000, 33);
       works();

    }


    public Employees(String name, String position, String email, String tel,
                     int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.wage = wage;
        this.age = age;

        print();

    }

    public void print() {
        System.out.println(name + ", должность: " + position + ", электронный адрес: " + email +
                ", телефон: " + tel + ", заработная плата: " + wage + ",  возраст: " + age);
        System.out.println();
    }


   public static void works() {
        Person[] arrPerson = new Person[5];
        arrPerson[0] = new Person("Ivanov Ivan", "Engineer",
                "ivanov@mail.ru", "3332525", 10000, 40);
        arrPerson[1] = new Person("Kozlov Pitr", "Economist",
                "kozpet@mail.ru", "3252525", 11000, 45);
        arrPerson[2] = new Person("Petrov Artem", "Cleaner",
                "artem@mail.ru", "2252525", 5000, 30);
        arrPerson[3] = new Person("Vasilieva Daria", "Accounted",
                "dariavas@mail.ru", "1112221", 9000, 42);
        arrPerson[4] = new Person("Kovaleva Maria", "Economist",
                "maria@mail.ru", "3252525", 11000, 45);

        for (int i = 0; i < arrPerson.length; i++) {
            if (arrPerson[i].age > 40) {
                System.out.println(arrPerson[i]);
            }}}
            }












