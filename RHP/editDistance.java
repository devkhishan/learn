import java.io.*; 
import java.util.*; 
/*
  r o s       
h       5
o       4
r       3
s       2
e 3 2 1 1
  3 2 1 0
  */
class editDistance{
    public static void main(String[] args){
        String s1 = "horse"; 
        String s2 = "ros"; 

        int[][] dp = new int[s1.length()+1][s2.length()+1]; 
        for(int i=s1.length();i>=0;i--) dp[s1.length()-i][s2.length()] = i;
        for(int j=s2.length();j>0;j--) dp[s1.length()][s2.length()-j] = j; 

        for(int i=s1.length()-1;i>-1;i--){
            for(int j=s2.length()-1;j>-1;j--){
                if (s1.charAt(i) == s2.charAt(j))  dp[i][j] = dp[i+1][j+1];
                else dp[i][j] = Math.min(dp[i+1][j+1],Math.min(dp[i+1][j],dp[i][j+1]))+1;
            }
        }

        System.out.println(dp[0][0]);
    }
}