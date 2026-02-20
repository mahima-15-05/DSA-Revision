package org.example.Method;

class Parent{
    String name="Maahi Tripathi";
    void displayName(String name){
        System.out.print(name);
    }
}


public class CallByRef {
     static void changeName(Parent p){
        p.name = "Kritiiii";
    }
    public static void main(String[] args) {
        Parent p = new Parent();

        changeName(p);
Parent q = new Parent();
        System.out.println(p.name);


    }
}
