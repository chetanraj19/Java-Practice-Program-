package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicatesElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in the array : ");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int m : arr){

            if(seen.contains(m)){
                duplicate.add(m);
            }
            else {
                seen.add(m);
                System.out.println(seen);
            }
        }

      if (duplicate.isEmpty()){
          System.out.println("No common enelments");
      }
      else {
          System.out.print("Common Elements : ");
          System.out.print(duplicate + " ");
      }


    }
}
