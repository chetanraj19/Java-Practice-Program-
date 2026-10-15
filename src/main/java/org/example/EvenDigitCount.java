package org.example;

public class EvenDigitCount {
    static boolean even(int num){
        int result =0 ;
        while (num!=0){
            num = num/10;
            result++;
        }
        if(result%2  == 0){
            return true;
        }

        return false;
    }
    static int FindDigit(int[] arr){
        int count= 0;
        for (int num :  arr) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {18, 124, 9, 17, 4849, 7525};
       int result =  FindDigit(arr);
        System.out.println(result);
    }
}