package com.company;

import java.time.LocalDate;

/**
 * Created by prabhu on 18/6/16.
 */
public class Person {
    String name;
    String email;
    int age;
    LocalDate birthDay;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println("Name: "+name);
    }

    public static int compareByAge(Person a, Person b) {
        return a.getAge()>b.getAge()? 1 : 0;
    }
}
