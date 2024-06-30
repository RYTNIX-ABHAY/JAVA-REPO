package demo;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        System.out.print(" ENTER YOUR ROLL NO :");
        Scanner input = new Scanner(System.in);
        int roll_no = input.nextInt();
        System.out.println(" Your roll no is :" + roll_no);
        //literals and identifiers
      int a = 234_000_000;
      System.out.println(a);
      String name = input.next();
      System.out.println(name);
    float marks = input.nextFloat();
    System.out.println(marks);
    }
}
