package demo;

import java.util.Scanner;

public class tempCon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter the temp in celcius :");
        float celcius = in.nextFloat(); 
        float farenheight = (celcius*9/5)+32;
        System.out.println(farenheight);
    }
}
