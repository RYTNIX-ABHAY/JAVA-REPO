package assignment;

import java.util.Scanner;

public class Ques8 {                                              // armstrong number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b =in.nextInt();
        for (int i = a; i < b; i++){
            int check ,rem, sum =0;
            check = i;
            while (check!=0){
                rem =check%10;
                sum =sum +(rem * rem * rem);
                check = check /10;
            }
            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
