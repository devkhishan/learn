import java.io.*; 
import java.util.*; 

class longestCommonSubsequence{
    public static void main(String[] args){
        String a = "abcde", b = "ace"; 

        int[][] dp = new int[a.length()+1][b.length()+1];

        for(int i=a.length()-1; i>-1; i--){
            for(int j=b.length()-1; j>-1; j--){
                if(a.charAt(i)==b.charAt(j)) dp[i][j] = dp[i+1][j+1] + 1;
                else dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]); 
            }
        }

        System.out.println(dp[0][0]); 
    }
}