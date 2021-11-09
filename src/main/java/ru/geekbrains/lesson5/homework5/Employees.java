package ru.geekbrains.lesson5.homework5;

public class Employees {
    public String name;
    public String position;
    public String email;
    public String tel;
    public int wage;
    public int age;
    public Person[] arrPerson;


    public void main(String[] args) {
        new Employees("Ольга", "economist",
                "olkinin", "3245724", 1000, 33);
        System.out.println(Person);

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
    }


    public void works() {
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
        printText();

    }

    public void printText() {
        for (int i = 0; i < arrPerson.length; i++) {
            if (this.age > 40) {
                System.out.println(arrPerson[i]);
            }
        }
    }
}






