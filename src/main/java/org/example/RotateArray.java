package org.example;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array ");

        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.print("Enter  array elements : ");
        for (int i = 0; i<n; i++) {

            arr[i] = sc.nextInt();
        }


         int last = arr[n-1];

        for (int i = arr.length-1 ; i>0; i--) {

            arr[i] = arr[i-1];
        }

        arr[0] = last;


        System.out.print("The work is completed : ");

        for (int a : arr) {

            System.out.print(a+" ");
        }
    }
}
