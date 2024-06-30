package Functionsss;

import java.util.Scanner;


public class Into {                             // METHODS
    public static void main(String[] args) {
       int ans = sum();
       System.out.println(ans);
        
    }
//     static void   sum (){
//         Scanner in = new Scanner(System.in);
//         System.out.print(" enter the first num :");
//         int num1 = in.nextInt();
//         System.out.print(" enter the secind num :");
//         int num2 = in.nextInt();
//         int sum = num1+ num2;
//         System.out.println("the sum is "+ sum );
//     }

    static int sum() {
        Scanner in = new Scanner(System.in);
         System.out.print(" enter the first num :");
         int num1 = in.nextInt();
         System.out.print(" enter the secind num :");
         int num2 = in.nextInt();
        int sum = num1+ num2;
        return sum;

    }
 }
