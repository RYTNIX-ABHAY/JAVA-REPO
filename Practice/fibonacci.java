package Practice;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        // find the nth fabonacci number ;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a =0;
        int b= 1;
        // int count =2;
        int c;
        // while ( count<=x){
           
        //     int temp=b;
        //     b=b+a;
        //     a=temp;
        //     count++;
        // }
        // System.out.println(b);
                                        
        for (int i =0; i<x ;i++){
            // System.out.println(a);
            c=a+b;
            a=b;
            b=c;
          }   
          System.out.println(a);                   
    }
}
