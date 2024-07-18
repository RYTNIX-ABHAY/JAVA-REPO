package Shorting;

import java.util.Arrays;

public class Bubble {
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
         bubble(arr);
     System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i< arr.length;i++){
            swapped=false;
            for (int j= 1; j<=arr.length -i-1;j++){
                if(arr[j-1]>arr[j]){
                    // swap
                    // int t=arr[j];
                    // arr[j]=arr[j-1];
                    // arr[j-1]=t;
                    int t = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                    swapped=true;
                }

            }if (!swapped){
                break;
            }
        }
    }
}
