package org.example.Interface;
public class Demo {
    public static void main(String[] args) {
//        Once obj = (String Name) -> System.out.println("CODER NAME IS :"+Name);
//        Once obj = Name -> System.out.println("CODER NAME IS : "+Name);
//
//        obj.show("CHETAN RAJ GOUR");



        Second obj1 =(int age, String Name, String Branch, int year) -> {
            System.out.println("the name of the person is "+Name+ " and the age is "+age+" Branch : "+Branch+"Year : "+year);
            return 0;
        };



        obj1.show(23,"Chetan Raj Gour"," MCA ",2025);
    }
}