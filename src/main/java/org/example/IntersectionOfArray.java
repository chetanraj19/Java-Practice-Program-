package org.example;

import java.util.Scanner;

public class IntersectionOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the lenght of first array : ");
        int n1 = sc.nextInt();
        System.out.print("enter the length of second array : ");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("enter the elements of the first array");
        for(int i = 0; i < n1; i++) {
           arr1[i] = sc.nextInt();
        }

        System.out.println("enter the elements of the second array");
        for(int i = 0; i < n2; i++) {
           arr2[i] = sc.nextInt();
        }
        int m = n1 + n2;
        int[] arr = new int[m];
        for (int i = 0 ; i< arr1.length;i++){
            for (int j = 0 ; j < arr2.length; j++){

                if(arr1[i] == arr2[j]){
                     arr[i] = arr1[i];
                }

            }

        }

        if(arr.length==0){
            System.out.println("no element common");
        }
        else {
            for (int nums : arr) {
                if(nums == 0){
                    continue;
                }
                System.out.print(nums+" ");
            }
        }
    }
}
