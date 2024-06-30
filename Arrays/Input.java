package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        // arr[0]=1;
        // arr[1]=2;
        // arr[3]=3;
        // arr[2]=5;
        // // [1,2,5,3,0]
        // System.out.println(arr[3]);

         // ip using for loops ......
        for (int i = 0; i < arr.length; i++){
          arr[i]=in.nextInt();
        }
        // op using for loop  
        System.out.println(Arrays.toString(arr));

       //or 
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
          }
           // enhanced version for output
          for ( int num:arr){
            System.out.println(num); //. here num represents element of the arr..... 
          }
    }
}
