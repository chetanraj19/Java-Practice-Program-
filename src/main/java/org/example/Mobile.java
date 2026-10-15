package org.example;

public class Mobile {
    String brand;
    int price;
    static String name;



    public Mobile(){
        brand = "Samsung";
        price = 200;
        System.out.println("i am in constructor");
    }

    static {
        name = "smart phone";
        System.out.println("i am in static block");
    }

    public void show(){
        System.out.println(brand +" : "+ price + " : "+ name);
    }

    public static void main(String[] args) {
//        Mobile obj = new Mobile();
//        Mobile obj1 = new Mobile();
//        obj.show();
    }
}
