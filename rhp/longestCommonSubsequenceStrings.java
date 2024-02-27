import java.util.*; 
import java.io.*; 

class longestCommonSubsequenceStrings{
    public static void main(String[] args){
        String a="abcde", b="abge";

        int[][] dp = new int[a.length()+1][b.length()+1];
        
        for(int i=1;i<=a.length();i++){
            for(int j=1;j<=b.length();j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        int i=a.length(), j=b.length(); 
        int pos=dp[i][j]-1; 
        char[] ans = new char[pos+1];

        while(i>0 && j>0){
            if (dp[i-1][j]==dp[i][j]){
                i-=1; 
            }
            else if (dp[i][j-1]==dp[i][j]){
                j-=1;
            } 
            else{
                ans[pos--]=a.charAt(i-1);
                i--;
                j--;
            }
        }
        System.out.println(String.valueOf(ans));
    
    }
}