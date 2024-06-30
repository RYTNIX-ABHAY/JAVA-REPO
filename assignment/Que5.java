package assignment;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b =in.nextInt();
        System.out.print("greatest is :");
        if (a>b){
           
            System.out.print(a);
        }
        else {
            System.out.print(b);
        }
    }
}
