package assignment;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a =0;
        int b=1;
        int c;
        System.out.println("FABONACCI SERIES");
        for (int i =0; i<x ;i++){
          System.out.println(a);
          c=a+b;
          a=b;
          b=c;
        }


    }
}
