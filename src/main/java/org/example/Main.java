package org.example;

import org.example.ArraysPractices.ArrayPractice;
import org.example.ArraysPractices.LowestAge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[ ] age = new int[10];
        System.out.println("input age : ");
            for (int i = 0; i < age.length; i++)
                age[i] = sc.nextInt();

        LowestAge obj = new LowestAge(age);
       int lowestage =   obj.lowestAge();
        System.out.println("the lowest age is: "+lowestage);

        int hightestage =   obj.highestAge();
        System.out.println("the hightest age is: "+hightestage);
    }
}