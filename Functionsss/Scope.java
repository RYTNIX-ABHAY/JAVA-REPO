package Functionsss;

public class Scope {
  public static void main(String[] args) {

    // block scope ..... ...
    int a = 2;// intilised outside the box ,int the same method hence u cann't initi again,,, but we can update it ...a
    int b = 4;

    {
        a =5; // reassing the original ref variable to some other value...      
        //int a = 34;
        System.out.println(a);
        int c = 32;
        // values initilised in the block , will remain in the block..... 
    }
    // System.out.println(c); // can'nt used ouside the box.. ....
    System.out.println(a); 
  }  
}
