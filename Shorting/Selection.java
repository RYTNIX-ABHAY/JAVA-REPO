package Shorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,9};
        secl(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void secl(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxindex= getMaxIndex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }

     static int getMaxIndex(int[] arr, int start, int end) {
       int max = start;
       for (int i=0;i<=end;i++){
        if (arr[max]<arr[i]){
            max=i;
        }
       }return max;
    }
    static void swap(int[] arr, int first, int sec) {
        int tem= arr[first];
        arr[first]=arr[sec];
        arr[sec]=tem;
    }
}
