package Leetcode;

public class Missingnum {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(missing(arr));

    }
    static int missing(int [] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if (arr[i]<arr.length &&arr[i]!=arr[correct]){
                swap(are,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    static  void swap(int[] arr, int f ,int s){
        int t = arr[f];
        arr[f]=arr[s];
        arr[s]=t;
    }
}
