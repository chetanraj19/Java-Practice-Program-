package org.example;
import java.util.Scanner;
public class StringCharectorRemoving {
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        System.out.println("Enter charector that you what to remove from the string");
        char ch = sc.next().charAt(0);
        String result = "";

        for(int i = 0; i<str.length();i++) {

            if(str.charAt(i)!= ch){
                 result += str.charAt(i);
            }
        }

        System.out.println(result);

    }
}
