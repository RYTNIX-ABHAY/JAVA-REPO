package demo;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num =input.nextFloat();
        // System.out.println(num);
        // int numb = (int)(55.86f);//  type casting bro  type casting 
        // System.out.println(numb);
        // automatic type promotion in expression 
        // int a = 257;
        // byte b=(byte)(a);// (257%256 =1)
        // System.out.println(b);
        // byte c =50;
        // byte d = 40;
        // byte e = 100;
        // int f =(c*d)/100;// yha pe operations krte smae vo int me krta hai 
        // System.out.println(f);
        // int mub ='A';
        // System.out.println(mub);
        // System.out.println("नमस्ते");// unicode
        byte b=42;
        char c='a';
        short s = 1024;
        int i = 500000;
        float f = 5.65f;
        double d = .1234;
        double result = (f*b) + (i / c) +(d*s);
        // output is float + int + double = double 
        System.out.println( (f*b )+" " + (i / c) +" " +(d*s));
        System.out.println(result);

    }
}
