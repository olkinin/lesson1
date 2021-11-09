package ru.geekbrains.lesson5.homework5;

public class Person {

    public String name;
    public String position;
    public String email;
    public String tel;
    public int wage;
    public int age;
    public int length;


    public Person(String name, String position, String email, String tel, int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.wage = wage;
        this.age = age;
    }
    public String toString(){
        return String.format("Name %s: Position %s: Email %s: Tel %s: Wage %d: Age %d\n",
                name,position,email,tel,wage,age);
    }


}
