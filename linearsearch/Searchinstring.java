package linearsearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Searchinstring {
    public static void main(String[] args) {
        String name ="abhay";
        char target = 'a';
        ArrayList<Integer> ans = stringsear(name, target);             // I M P O R T A N T . . . . . .
        System.out.println(ans);
        int[] ans2 =sear(name, target);
        System.out.println(Arrays.toString(ans2));
        
    }
    static ArrayList<Integer>  stringsear(String arr, char  tar){
        
         ArrayList<Integer> list =new ArrayList<>();
         
         if(arr.length()==0){
             list.add(-1);
         }
         for ( int i=0; i<arr.length();i++){
           
            if (arr.charAt(i)==tar){
                list.add(i);
            
            }
            
         }   
            if (list.size()==0){
                list.add(-1);
            }
         return  list;
    }

    static int[] sear(String a, char b){
        int[] x=new int[5];
        int count=0;
           if(a.length()==0){
             x[0]=-1;
           }
           for (int i=0;i<a.length();i++){
            if(a.charAt(i)==b){
                x[i]=i;
                count++;
            }
           }if(count==0){
            x[0]=-1;
            return x;
           }
           return x;
    }
}
