package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class SwarIn2D {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[][] arr={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56}
     };
     System.out.print("ENTER THE TARGET:");
     int Target= in.nextInt();
     
     int[] ans = search(arr, Target);// formate to return value { row,column}
     System.out.println(Arrays.toString(ans));
    }


    static int[]  search (int[][] arr, int tar){
        if(arr.length==0){
            return new int[] {-1,-1};
        }
        for ( int i = 0 ; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==tar){
                   return new int[]  {i,j};
                }
            }
            }return new int[] {-1,-1};
        
    }
}
