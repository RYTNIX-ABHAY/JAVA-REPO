package Functionsss;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6);
        multi(1,2,55647,876889);}

    static void multi( int a, int b, int...v){
  System.out.println(Arrays.toString(v));
    }
    static void fun ( int ...v){
        System.out.println(Arrays.toString(v));
    }
}


