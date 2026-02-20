package org.example.OOP;

class Women{
  String fav_color;
  String name;


  Women(){
      System.out.println("Wommen constructor is called");
  }
}

class Girl extends Women{

    Girl(String color,String name){
        this.fav_color=color;
        this.name=name;
    }
    Girl(){
//        super();
        System.out.println(super.fav_color);
        System.out.println(super.name);
        System.out.println("Girl constructor");
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        Girl girl1 = new Girl("Yello", "Manvi");
        Girl girl = new Girl();
//        System.out.println(girl.fav_color);
    }
}
