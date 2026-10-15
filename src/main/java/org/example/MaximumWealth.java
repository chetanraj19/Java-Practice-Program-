package org.example;

public class MaximumWealth {
    static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int[] arr = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j <accounts[i].length ; j++) {
                sum = sum + accounts[i][j];
            }
            arr[i] = sum;
            sum = 0;
            }
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {

            if(arr[i] > max){

             max = arr[i];
            }

        }
        return max;
        }
    }
