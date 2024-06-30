package Practice;

public class Prac2 {
    public static void main(String[] args) {
           // COUNTING OCCURANCE;
        /*
         *if we divide any number by 10 we get the last digit
         * n%10 = last digit;
         * n/10 = give us the remaining part of the number ; 
         */
        int x = 123453245;  
        
         int count =0;
         while (x > 0){
            int rem =x % 10;
            if (rem==5){
                count++;
            }
            x=x/10;
        }  
        System.out.println(count);  
    }
}
