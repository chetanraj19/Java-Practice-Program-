package org.example;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of the array");
         int n = sc.nextInt();

         int[] arr = new int[n];
        System.out.println("Enter elements of the array : ");
        for (int i = 0; i <n-1 ; i++) {
            arr[i] = sc.nextInt();

        }
        int sum = (n*(n+1))/2;
        int result = 0;
        for (int i = 0; i <n-1 ; i++) {
            result += arr[i];
        }

        int numberMissing = sum - result;

        System.out.println("Missing Number is : "+numberMissing);

    }
}
