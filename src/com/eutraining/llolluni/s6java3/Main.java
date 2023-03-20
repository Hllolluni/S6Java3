package com.eutraining.llolluni.s6java3;

import com.eutraining.llolluni.s6java3.guis.Form1;

abstract class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {
        new Form1();
    }
}
