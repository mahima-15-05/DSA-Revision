package org.example.OOP;



 interface Animal{
    void eat();
    void sleep();

    void hear();
} interface Animal2{
    abstract void eat2();
    abstract void sleep();

    void hear();
}


class Dog implements Animal, Animal2{

    @Override
    public void eat() {

    }

    @Override
    public void eat2() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void hear() {

    }
}


public class Interface {
    public static void main(String[] args) {

    }
}
