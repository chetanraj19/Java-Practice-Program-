package org.example.polymorphims.Exception;

import java.util.Scanner;

public class ArrayExc {
    final int MAX = 12;
    public void input(int[] arr){
        Scanner sc = new Scanner(System.in);
       try {
           for (int i = 0; i < MAX; i++) {
               arr[i] = sc.nextInt();
           }
       }
       catch (Exception e){
           System.out.println(e);
       }
    }
}
