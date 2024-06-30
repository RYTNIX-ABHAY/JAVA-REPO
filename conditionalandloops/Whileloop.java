package conditionalandloops;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        //Q; print num 1 - n
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i =1;
      while ( i<=n){
        System.out.println(i);
        i++;
      }  
    
    }
}
