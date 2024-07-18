package Shorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr ={4,1,5,3,2};
        ins(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ins(int[] arr){
        for(int i= 0;i<=arr.length-2;i++){
            for(int j= i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
               swap(arr,j,j-1);
                }else{
                    break;
                }
                
            }
        }
    }
    static void swap(int[] arr , int first, int second){
        int t = arr[first];
        arr[first]=arr[second];
        arr[second]=t;
    }
}
