package Practice;

public class InfiniteARRAY {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100};
        int target=10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr ,int target){
        // size of box 2
        int start =0;
        int end = 1;
        while(target>arr[end]){
            int newS= end+1;
            // size of box is (end-start+1)
            end = end +(end-start+1)*2;
            start = newS;
        }
        return BS(arr ,  target ,  start ,  end);
        
    }
    static int BS(int[] arr , int target , int start , int end){
       
        while(start<=end){
           
            //int mid = (start+end)/2;
            // might be the start + end will exceed the range of int in java....
            int mid = start + (end-start)/2;
            if(target< arr[mid]){
                end = mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            } else {
                return mid;
            }
        } return -1;
    }
}
