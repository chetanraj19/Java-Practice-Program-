package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Static_Concept {
   private int age;
   private String name;
   private float mark;

   static void help(){
       System.out.println("i am here to hepl you! ");
   }

   public static void Show(Static_Concept obj){
       System.out.println("i am in static method!");
       System.out.println("name : "+obj.name);
       System.out.println("age  : "+obj.age);
       System.out.println("marks: "+obj.mark);
    }
   void Setter(String name,int age, float mark){
       System.out.println("I AM IN SETTER!");
      this.age = age;
       this.name = name;
       this.mark = mark;
   }

   void Getter(){
       System.out.println("i am in Getter!");
       System.out.println("name : "+name);
       System.out.println("age  : "+age);
       System.out.println("marks: "+mark);
   }
    public static void main(String[] args) {

       int age;
       float mark;
       String name;
       Static_Concept obj = new Static_Concept();
       Static_Concept obj2 = new Static_Concept();

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name , age and marks (in order)");
            name = sc.nextLine();
            age = sc.nextInt();
            mark = sc.nextFloat();
       //Static_Concept.help();
       obj.Setter(name,age,mark);
       obj.Getter();

        //obj2.Setter(name,age,mark);
       obj2.Getter();
       Static_Concept.Show(obj);
    }
}
