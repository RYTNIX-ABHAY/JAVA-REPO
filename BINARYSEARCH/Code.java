package BINARYSEARCH;

import java.util.Arrays;

public class Code {
    public static void main(String[] args) { 
        // int[] arr ={1,2,3,4,5};
        // System.out.println(Arrays.toString(arr));
         int[] arr = {1,4,6,7,9,12,23};
         int target=148;
         System.out.println(Bsearch(arr, target));
    }
    static  int Bsearch(int[] arr , int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
           
            //int mid = (start+end)/2;
            // might be the start + end will exceed the range of int in java....
            int mid = start + (end-start)/2;
            if(target< arr[mid]){
                end = mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            } else {
                return mid;
            }
        }   ///  it gives the boundary conditions ...
        // for (int i=0; i<arr.length;i++){
        //     int mid = start +(end-start)/2;
        //     if (target==arr[mid]){
        //         return mid;
        //     }
        //     if (target>arr[mid]){
        //         start=mid+1;
        //     }else if (target<arr[mid]){
        //         end = mid-1;
        //     }
        // }
        return  -1;
    }
}
