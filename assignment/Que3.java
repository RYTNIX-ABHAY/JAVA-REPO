package assignment;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float P = in.nextFloat();
        float R = in.nextFloat();
        int T = in.nextInt();
        float simple_intrest = (P*R*T)/100;
        System.out.println(simple_intrest);

    }
}
