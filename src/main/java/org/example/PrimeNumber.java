package org.example;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter a number");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("not a valid number");
            }
            boolean isprime = true;
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }


            }

            if (isprime){
                System.out.println("prime number");
            }
            else {
                System.out.println("not a prime number");
            }

            System.out.println("Do you want to run it again : Y/N : ");
            choice = sc.next().charAt(0);
        }while(choice == 'Y' || choice == 'y') ;
    }
}
