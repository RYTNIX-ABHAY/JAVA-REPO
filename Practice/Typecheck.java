package Practice;

import java.util.Scanner;

public class Typecheck {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print(" enter the character:");
     char alpha = in.next().trim().charAt(0);//             trims the string or we can say that it stores in character.
     if ( alpha>='a' && alpha<='z'){
        System.out.println("small letter" );
        System.out.println(alpha);
     }
     if (alpha>='A' && alpha<='Z'){
        System.out.println(" capital letter" );
        System.out.println(alpha);
     }


    }
}
