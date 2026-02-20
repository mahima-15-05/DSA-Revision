package org.example.OOP;

abstract class Abs {
    void sleep() {
        System.out.println("Sleeping");
    }

    abstract void eat();
}


class Child extends Abs {
    @Override
    void eat() {
        System.out.println("Eating");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Child ch = new Child();
//        ch.eat();

        ch.sleep();
    }
}



/*
 * Abstact keyword
 * extended
 * Cannot make object of abs class
 * can have normal or abstract method
 * can have constructors
 * */