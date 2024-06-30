package Functionsss;



public class ParaString {
    public static void main(String[] args) {
        String personalised = greet("Abhay");
        System.out.println(personalised);
        
    }
    static String greet( String name){
        String message ="hello"+ " "+ name ;
        return message;
    }
}
