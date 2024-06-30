package BINARYSEARCH;

public class OABS {
    public static void main(String[] args) {
       // int[] arr ={-9,-4,-1,0,1,3,6,8,9,23,45,56};
       int[] arr ={99,79,56,34,2,-34};
        int target=56  ;
        System.out.println(Oabs(arr, target));
    }
    static  int Oabs(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
   
          if (arr[end]>arr[start]){
            // incresing order
            while(start<=end){
                int mid = start +(end-start)/2;
             if(target>arr[mid]){
             start=mid+1;
             }else if(target<arr[mid]){
             end=mid-1;
             }
             else{
                return mid;
             }
          } return -1;
    
        }
        else{
            while(start<=end){
                int mid = start +(end-start)/2;
                if(target>arr[mid]){
               end=mid-1;
                }else if (target<arr[mid]){
                start = mid+1;
                }
                else{
                    return mid;
                }
            }return -1;
        }

    }


}
