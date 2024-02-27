import java.io.*; 
import java.util.*; 

class knapsack 
{ 
    public static int helper(int W, int wt[], int val[], int n, int[][] dp){
         if (n==0) return 0; 
         if (dp[n-1][W]!=-1) return dp[n-1][W];
         
         if (wt[n-1]>W) return helper(W,wt,val,n-1,dp);
         return (dp[n-1][W] = Math.max(helper(W,wt,val,n-1,dp),val[n-1]+helper(W-wt[n-1],wt,val,n-1,dp)));
    }
    public static void main(String[] args) 
    { 
        int W=4;
        int wt[]=new int[]{4,5,1}, val[] = new int[]{1,2,3}; 
        int n=3;
        int[][] dp = new int[n][W+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        System.out.println(helper(W,wt,val,n,dp));
    } 
}