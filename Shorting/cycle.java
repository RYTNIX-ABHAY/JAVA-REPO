package Shorting;

import java.util.Arrays;

public class cycle {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort (int[] arr){
        int i=0;
        while(i<arr.length){
            int correctindex= arr[i]-1;
            if(arr[i]==arr[correctindex]){
                i++;
            }else{
                swap(arr,i,correctindex);
            }
        }
    }static  void swap(int [] arr, int f, int s){
        int t=arr[f];
        arr[f]=arr[s];
        arr[s]=t;
    }
}
