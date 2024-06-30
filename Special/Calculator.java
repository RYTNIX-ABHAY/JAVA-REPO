package Special;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int ans =0;
       while (true){
        System.out.print(" enter operator:");
        char op =in.next().trim().charAt(0);
        if( op =='+'|| op=='*' || op=='/' || op=='-'){
        System.out.print(" enter a:");
        int a = in.nextInt();
        System.out.print(" enter b:");
        int b = in.nextInt();
      
        if(op == '+'){
            ans =a+b;
        }
        if(op == '-'){
            ans =a-b;
        }
        if(op == '*'){
            ans =a*b;
        }
        if(op == '/'){
          if(b!=0){
            ans =a/b;
          }
        }}  
        else if (op == 'x'|| op == 'X'){
            break;
        }
        System.out.println(ans);

       }
      
    }
}
