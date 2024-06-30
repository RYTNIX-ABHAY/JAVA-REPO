package Leetcode;

public class CeilingNUmber {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target=20;
        System.out.println(ceiling(arr, target));
    }
    static  int ceiling(int[] arr , int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end = arr.length-1;
        while(start<=end){
           
            // ceiling means smallest no among the numbers greater than or equal to the target ;
            int mid = start + (end-start)/2;
            if(target< arr[mid]){
                end = mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            } else {
                return mid;
            }
        }   
        return  start;
    }
}
