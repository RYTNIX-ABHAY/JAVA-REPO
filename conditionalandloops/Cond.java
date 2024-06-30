package conditionalandloops;

public class Cond {
    public static void main(String[] args) {
        //if statement 
        int salary = 25000;
        if ( salary> 10000){
            salary=salary+2000;
        }
        else {
            salary= salary+1000;

        }
        System.out.println(salary);
    }
}
