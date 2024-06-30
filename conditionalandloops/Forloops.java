package conditionalandloops;

import java.util.Scanner;

public class Forloops {
    public static void main(String[] args) {
        // for loop
        /*
          SYNTAX :
           for ( intilization ; condition ; updation){
           //body
           }
         */

         // Q: wap to print number from 1 -5;
         int x =5;
         for ( int i=1;i<=x;i++){
            System.out.println(i);
         }



         // Q: wap to print number from 1to n
         Scanner in = new Scanner(System.in);
         System.out.print("enter the number:");
         int num = in.nextInt();
         for ( int i =1; i<=num; i++){
          System.out.println(i);
         }

    }
}
