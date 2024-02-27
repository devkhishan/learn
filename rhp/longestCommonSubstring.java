import java.io.*; 
import java.util.*; 

class longestCommonSubstring{
    public static void main(String[] args){
        String a = "abcde", b = "abcef"; 
        int[][] dp = new int[a.length()+1][b.length()+1];
        int max = 0;
        int pos=0;
        for(int i=1;i<=a.length();i++){
            for(int j=1;j<=b.length();j++){
                if (a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if (max<dp[i][j]){
                        max = dp[i][j];
                        pos = i; 
                    }
                }
            }
        }
        System.out.println("Length : " + max);
        System.out.println("String : " + a.substring(pos-max,pos));
    }
}