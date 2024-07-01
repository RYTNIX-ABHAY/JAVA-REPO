package Leetcode;

public class LC744 {
    public static void main(String[] args) {
        char[] arr = {'a','b','d','h','k'};  //      find the smallest letter greator than Target.........
        char target = 'f';
        System.out.println(search(arr, target));

    }
    static char search(char[] arr, char target){
        int start =0;
        int end = arr.length -1;
        while (start<=end) {
            int mid = start + (end - start )/2;
            if (arr[mid]<target){
                start = mid +1;
            } else{
                end = mid -1;
            }
             
         } return arr[start % arr.length];
    }
}
