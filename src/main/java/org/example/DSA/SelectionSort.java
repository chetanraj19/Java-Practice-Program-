package org.example.DSA;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
     int[] arr = {4 , 3 , 6 ,2 ,5 ,1};
     selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i= 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;

            int maxindex = getMaxIndex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <=last ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
