package org.example;

import java.util.Scanner;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the targer number : ");
        int target = sc.nextInt();

        System.out.println("Enter array elements");
        for (int i = 0; i <arr.length; i++) {

            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length ; i++) {

            for (int j = (i+1); j<arr.length ; j++) {

                if(arr[i] + arr[j] == target){
                    System.out.println("founded the index number : "+i + " "+j);
                }
        }
    }
}
}