package Special;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
//   int n = in.nextInt();
//   System.out.println(isarmstrong(n));


  for (int i =100;i<1000;i++) {
    if (isarmstrong(i)){
        System.out.println(i);
    }
      
  }

    }
    static boolean isarmstrong(int n){
        int ori=n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n=n/10;
            sum = sum + rem*rem*rem;
        }
        return sum==ori;
    }
}
