package org.example.ArraysPractices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayPractice {
    Scanner sc = new Scanner(System.in);
    String fName;
    public ArrayPractice(){
        System.out.println("i need you name for forther execution :");
       fName= sc.nextLine();
    }
    String[] arr = {"chetan", "nikita", "Raj", "Prachi"};

    int[] nums = new int[10];



    String[] arr1 = new String[5];



// inputs methods for string

    public void nameInput() {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("input " + i + " name");
            arr1[i] = sc.next();
        }
    }

    // input methods for int
    public void numInput() {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("input " + (i+1) + "st number");
            nums[i] = sc.nextInt();
        }

        System.out.println("thank you for printing the data : "+fName);
    }

    // outup methods for numbers and name

    public void nameOutPut() {
        for (int num: nums ) {
            System.out.println("Number : " + num);
        }

    }

    public void numOutPut() {
        for (int num: nums ) {
            System.out.println("Number : " + num);
        }
        System.out.println("thank you for printing the data : "+fName);
    }

}
