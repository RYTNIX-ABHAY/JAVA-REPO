package linearsearch;

public class Findmin {
    public static void main(String[] args) {
        int[] arr= {34,56,78,6};
      System.out.println(min(arr));
    }
    static int min (int[] arr){
        if(arr.length==0){
            return 0;
        }
        int mini=arr[0];
        for ( int i=0;i<arr.length;i++){
         if(arr[i]<mini){
            mini =arr[i];
         
         }
        }return mini;
    }
}
