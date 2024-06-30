package Practice;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();


      // check largest
    //   if (a>b && a>c){
    //     System.out.println(" a is largest" +a);

    //   }
    //   if (b>c && b>a){
    //     System.out.println(" b is largest" +b);

    //   }
    //   if (c>a && c>b){
    //     System.out.println(" c is largest " +c);
    //   }
    // int max = a;
    // if ( b> max){
    //     max=b;
    // }
    // if ( c> max){
    //     max = c;
    // }
    // System.out.println(" max is :" + max);
    int max =Math.max(c,Math.max(a, b));
    System.out.println(max);
   
    }
}
