package Arrays;

import java.util.Arrays;
import java.util.Scanner;


     public  class Multidimensi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int[][] arr = new int[4][];
        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,1,3,}
        // };
        int[][] arr= new int[3][3];// arr leng is  no of rows... 
       for (int i = 0; i < arr.length; i++) {
        for ( int j = 0 ; j< arr[i].length;j++){
            arr[i][j]= in.nextInt();
        }
       }
       // o/p
    //    for (int i =0;i<arr.length;i++){
    //     for (int j=0;j<arr[i].length;j++){
    //         System.out.print(arr[i][j] + " ");
    //     }System.out.println();
    //    }
    for (int m=0;m<arr.length;m++){
        System.out.println(Arrays.toString(arr[m]));
    }

     }
}
