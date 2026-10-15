package org.example.DSA;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2 , 4 , 6 , 7, 8 , 9 , 10 , 34, 56, 78, 98 , 120};
        int target = 34;

      int ans =   binarySearch(arr, target);

        System.out.println("the index where the element stored is "+ans);
    }

    // code for binary search , we are writing code for getting the index where the element stored

    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while (start<=end){
            mid = start + (end - start)/2;

            if(target >arr[mid]){
                start = mid +1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
