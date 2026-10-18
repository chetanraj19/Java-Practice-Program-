package org.example.DSA;

import java.util.Arrays;

import static org.example.DSA.SelectionSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){

        // this is my logic
//        for (int i = 0; i < arr.length; i++) {
//            int j = 0;
//            if(arr[j] != (j+1)){
//                swap(arr , j , arr[j] -1);
//            }else{
//                j++;
//            }
//        }

        // this is kunals logic

        int i =0;
         while (i <arr.length){
             int correct = arr[i] -1;
             if(arr[i] != arr[correct] ){
                 swap(arr , i , correct);
             }else{
                 i++;
             }
         }

    }
}
