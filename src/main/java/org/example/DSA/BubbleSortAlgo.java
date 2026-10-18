package org.example.DSA;

public class BubbleSortAlgo {
    public static void main(String[] args) {
      int[] arr = { 1 , 3 , 5 , 2, 4};
      int[] ans =  bSort(arr);
      for (int a : ans){
          System.out.println(a);
      }
    }

    static int[] bSort(int[] arr){
       boolean swapped ;
        for(int i = 0 ; i <= arr.length-1; i++){
            swapped = false;
            for (int j = 1 ; j < arr.length -i;j++){
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped){
               break;
            }
        }
         return  arr;
    }
}