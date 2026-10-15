package org.example.DSA;
// amazon level questions
public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = {2 , 4 , 6 , 7, 8 , 9 , 10 , 34, 56, 78, 98 , 120};
        int target = 98;
        int ans = answer(arr , target);
        System.out.println(ans);
    }
   static int answer(int[] arr , int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            // double the box value
            end  = end + (end - start + 1 ) * 2;

            start  = newStart;
        }

        return  binarySearch(arr , target , start , end);
   }

  static int binarySearch(int[] arr , int target , int start , int end){

        while(start <= end ){
          int mid = start + (end - start)/2;

          if(target < arr[mid]){
              end = mid - 1;
          }else if(target > arr[mid]){
              start = mid + 1;
          }else{
              return mid;
          }
        }
        return -1;
    }

}


