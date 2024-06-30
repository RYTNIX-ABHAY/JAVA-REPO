package Leetcode;


public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr ={234,-34,3455,33212};
        int ans =findnumbers(arr);
        System.out.println(ans);
        System.out.println(digit2(0));
    }
    static  int findnumbers(int[] nums){
        int count =0;
        for (int i=0;i<nums.length;i++){
      if (even(nums[i])){
        count++;
      }
        }return count;

    }
    static boolean even(int num ){
        int numofdigits=digit2(num);
        // if(numofdigits%2==0){
        //     return true;
        // }
        // return false;
        return numofdigits%2==0;
    }

static int digit2 (int num ){
    if(num<0){
    num=num*-1;
}
    if(num==0){
    return 1;
}
    return (int)(Math.log10(num)) + 1;
}







    static int digit(int num ){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
