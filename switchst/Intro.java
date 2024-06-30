package switchst;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String fruit = in.next();
    //     switch (fruit) {
    //         case "mango" -> System.out.println(" king of fruits ");
    //         case "apple" -> System.out.println(" a red sweet apple ");
    //         default -> System.out.println(" input not valid");
    //     }
          int day = in.nextInt();
          
        switch (day){
            case 1  -> {System.out.println("Monday");
        
        }
            case 2  -> System.out.println("Tuesday");
            case 3  -> System.out.println("Wednesday");
            case 4  -> System.out.println("Thursday");
            case 5  -> System.out.println("Friday");
            case 6  -> System.out.println("Saturday");
            case 7  -> System.out.println("Sunday");
            default -> System.out.println("enter valid input");
          }
          switch (day){
            case 1,2,3,4,5 -> System.out.println("working day");
            case 6,7 -> System.out.println("holiday");
            default -> System.out.println(" nope");
          }
     }
}
