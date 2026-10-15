package org.example;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choise;
        do{
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            int sum = 0;
            for(int i =1 ; i <= num/2 ; i++){
                if(num % i == 0) {
                    sum = sum + i;
                }
                else {
                    System.out.println("not a perfect number");
                }
            }
            if(num == sum){
                System.out.println("Perfect Number");
        }
            System.out.println("Do you want to continue : Y/N");
             choise  = sc.next().charAt(0);

            }while (choise == 'y' || choise == 'Y');
    }
}
