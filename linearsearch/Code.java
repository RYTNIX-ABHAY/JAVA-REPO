package linearsearch;

public class Code {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,4,6,7,8,9};
        int target =4;
        int ans = linerSearch(arr, target);
        System.out.println(ans);
        System.out.println(linerSearch2(arr, target));
    }
    static int linerSearch( int[] arr , int tar){
       if (arr.length==0){
        return -1;
       }
       for (int i= 0 ; i<arr.length;i++){
        if ( arr[i]==tar) {
            return i;
        }
       }return -1;
    }
    static boolean  linerSearch2( int[] arr , int tar){
        if (arr.length==0){
         return false;
        }
        for (int i= 0 ; i<arr.length;i++){
         if ( arr[i]==tar) {
             return true;
         }
        }return false;
     }
}
