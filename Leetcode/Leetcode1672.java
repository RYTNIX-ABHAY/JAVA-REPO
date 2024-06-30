package Leetcode;
public class Leetcode1672 {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,6},
            {34,56,44}
        };
  System.out.println(maxwealth(accounts));
    }
    static int maxwealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        // i= person and j= bank;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            // when u take the new bank(wealth), take the new sum for that person(money);
            for (int j=0;j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
                
            }
            // now we have sum of accounts of person 
            // check with overall ans 
            if (sum>ans){
                ans=sum;
            }
        } return ans;
    }
}
