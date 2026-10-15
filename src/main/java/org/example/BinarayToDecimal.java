package org.example;

import java.util.Scanner;

public class BinarayToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        String str = sc.nextLine();

        int num = Integer.parseInt(str,2);

        System.out.println("the number is : "+num);
    }
}
