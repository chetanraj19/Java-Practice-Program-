package org.example;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0;
        int odd = 0;

        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int j = 0 ; j<n ;j++){
            if(arr[j] %2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("the even count is : "+even + " and the odd count is : "+odd);

    }
}
