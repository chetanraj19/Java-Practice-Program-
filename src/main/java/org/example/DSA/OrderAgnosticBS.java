package org.example.DSA;

public class OrderAgnosticBS {


    public static void main(String[] args) {
        int[] arr = {120 , 94 , 86 , 77, 68 , 59 , 40 , 34, 26, 18, 8 , 2};
       // int[] arr = {2 , 4 , 6 , 7, 8 , 9 , 10 , 34, 56, 78, 98 , 120};
        int target = 2;
        int ans = orderAgnosticBS(arr , target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        //find whether the array is sorted in ascending or descending
        boolean isAsc;

        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }


        if (isAsc) {
            while (start <= end) {
                mid = start + (end - start) / 2;

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                mid = start + (end - start) / 2;

                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
        return -1;
    }
}
