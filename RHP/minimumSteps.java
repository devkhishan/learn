import java.io.*;
import java.util.*; 

class minimumSteps{
    public static void main(String[] args){
        int[] curr = new int[]{1,100,1,1,1,100,1,100,1};
        int[] dp = new int[curr.length+2]; 
        Arrays.fill(dp,0); 

        for(int i=curr.length-1;i>-1;i--){
            dp[i] = Math.min(curr[i] + dp[i+1], curr[i] + dp[i+2]);
        }

        System.out.println(Math.min(dp[0],dp[1]));
    }
}