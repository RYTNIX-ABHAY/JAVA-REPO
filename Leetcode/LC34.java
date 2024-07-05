import java.util.Arrays;
//                                        https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class LC34 {
    
    public static void main(String[] args) {
      // Find the first and last position of target .. if not found return {-1,-1}
  int[] arr ={5,7,7,7,8,8,10};
  int target=7;
System.out.println(Arrays.toString(search1(arr, target)));


    }
    static int[] search1(int[] arr , int  target){
        int[] ans ={-1,-1};
         int st= search(arr, target, true);
         int ed=search(arr, target, false);
         arr[0]=st;
         arr[1]=ed;
      return ans;

    }
    static int search(int[] arr , int target , boolean isStart){
        int ans =-1;
        int start=0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=mid-1;
            }else {
                ans=mid;// potential answer
                if(isStart){
                    //find first index
                    end =mid-1;
                }else{
                    start=mid+1;
                }
            }
        } return ans;
    }
}
