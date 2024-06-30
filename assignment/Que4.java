package assignment;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a =in.nextInt();
        int b = in.nextInt();
 char  sign =in.next().charAt(0);
     if ( sign == '+'){
        System.out.println(a+b);
     }
     if (sign == '*'){
        System.out.println(a*b);
     }
    }
}
