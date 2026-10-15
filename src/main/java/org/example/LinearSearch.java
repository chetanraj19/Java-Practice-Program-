package org.example;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element in Array : ☻");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + i + "th element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to find in the array : ");
        int target = sc.nextInt();
        int result = linerSearach(arr, target);
        if (result != -1) {
            System.out.println("the elemnt is in the index " + result);
        }else {
            System.out.println("The element did not found");
        }
    }


    // linear searching algorithm
    static int linerSearach(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
