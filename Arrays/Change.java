package Arrays;

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] arr ={ 1,2,3,45,5};
        System.out.println(Arrays.toString(arr));
        Change(arr);
        System.out.println(Arrays.toString(arr));// mutable behaviour 
    }
    static void Change (int[] ch){

        ch[2]=34;
    }
}
