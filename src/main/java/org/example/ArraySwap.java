package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Enter "+i+"th Element : ");
            arr[i] = sc.nextInt();

        }

//        System.out.print("Enter the index number , you want to swap the values : ");
//        int index1 = sc.nextInt();
//        int index2 = sc.nextInt();
//
//        swap(index1 , index2 , arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("THE max elemenet is : "+max(arr));
//
//
//        System.out.println("Enter the index number where you want to search the element , starIndex and endIndex  : ");
//        int sterIndex = sc.nextInt();
//        int endIndex = sc.nextInt();
//        System.out.println("the max element in the given range is : "+max(sterIndex , endIndex ,  arr));


        // reverse the array

        reverseArray(arr);

        System.out.print("The array is reversed -> "+ Arrays.toString(arr));


    }

    static void swap(int index1 , int index2 , int[] arr){

        if(index1 > index2){
            return;
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int max(int startIndex , int endIndex ,int[] arr){
        int max = arr[startIndex];

        for (int i = startIndex; i < endIndex; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        for (int i = 0 ; i< arr.length ; i++) {
            if(start < end) {
                swap(start, end, arr);
            }
            start++;
            end--;



        }

    }
}
