package org.example.OOP;

class Person{
    int age;
    String name;
    int arr[]= {1,2,3};

    Person(){
        this.age=0;
        this.name="";
        this.arr= new int[]{1, 2};
    }

    Person(int age, String name, int arr[]){
        this.age=age;
        this.name=name;
        this.arr=arr;
    }

    Person(Person p){
        this.age=p.age;
        this.name=p.name;
        this.arr=p.arr.clone();

    }
}

public class Constructor {
    public static void main(String[] args) {
        int arr[] ={100,2};
        Person p = new Person(23, "Manya",arr);
        Person p1 = new Person(p);
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p1.arr[0]);
        int arr2[] ={143,23};
        p1.arr=arr2;
        System.out.println(p.arr[0]);
        System.out.println(p1.arr[0]);


    }
}
