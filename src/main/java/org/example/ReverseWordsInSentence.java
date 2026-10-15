package org.example;

import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = sc.nextLine();
        String[] arr = sentence.split(" ");
        for (int i =arr.length-1 ; i>=0 ;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
