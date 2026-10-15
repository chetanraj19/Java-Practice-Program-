package org.example;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        System.out.println("enter another string");
        String str2 = sc.nextLine();

        if(str.contains(str2)){
            System.out.println("substring found");

        }
        else{
            System.out.println("substring not found");
        }
    }
}
