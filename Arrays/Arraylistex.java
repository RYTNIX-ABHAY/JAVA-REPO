package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(34);
        // list.add(23);
        // list.add(00);
        // list.add(231);
        // System.out.println(list);
        for (int i = 0 ; i<5; i++){
           list.add(in.nextInt());
        }
        // // for( int i=0;i<5;i++){
        //     System.out.println(list.get(i)); // pass index here
        // }
        System.out.println(list);
    }
}
