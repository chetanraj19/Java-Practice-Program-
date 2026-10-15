package org.example;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int max = sc.nextInt();
        int[] arr = new int[max];

        System.out.print("Enter array elements : ");
        for (int i=0;i< max ; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondL=0;

        for (int i= 0; i<arr.length;i++){

            int current = arr[i];

            if(current > largest){
                secondL = largest;
                largest = current;
            }
           else if (current > secondL && current != largest) {

                secondL = current;

            }


        }

        System.out.println("second largest number is :"+secondL);

    }
}
