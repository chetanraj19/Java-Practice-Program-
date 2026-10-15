package org.example;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row lengths");
        int row = sc.nextInt();
        System.out.println("Enter column lengths");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter the element ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter "+i + ""+j+ " Elements");
                arr[i][j] =sc.nextInt();
            }

        }
        System.out.println("the transpose of Matrix");
        for (int i = 0; i <column ; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");

        }

    }
}
