package org.example.polymorphims;

class Happy{

    // Constructor of this class
    Happy() {
        System.out.println("in constructor");
    }

    // Method of this class
    public static void print() {
        System.out.println("hello");
    }

    static {
        System.out.println("i am in static block");
    }
}




public class GFG{
    public static void main(String[] args) {
        new Happy().print(); // anonymous object

    }
}