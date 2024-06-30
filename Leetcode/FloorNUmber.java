package Leetcode;

public class FloorNUmber {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target=20;
        System.out.println(ceiling(arr, target));
    }
    static  int ceiling(int[] arr , int target){
        // but what if the target element is greater than the greatest number in the array;
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end = arr.length-1;
        while(start<=end){
           
          // floor means greatest no among the numbers smallar  or equal to the target ;
            int mid = start + (end-start)/2;
            if(target< arr[mid]){
                end = mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            } else {
                return mid;
            }
        }   
        return  end;
    }

}
