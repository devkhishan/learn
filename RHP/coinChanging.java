import java.io.*; 
import java.util.*; 

class coinChanging{
    public static void main(String[] args){
        ArrayList<Integer> coins = new ArrayList<>(Arrays.asList(1,2,5)); 
        int target = 11; 
        // [0, 1, ]
        int[] dp = new int[target+1];
        Arrays.fill(dp,target+1);
        dp[0] = 0;

        for(int i=1;i<target+1;i++){
            for(int j=0;j<coins.size();j++){
                int value = coins.get(j); 
                if (value<=i){
                    dp[i] = Math.min(dp[i-value]+1,dp[i]); 
                }
                
            }
        }

        System.out.println((dp[target]!=target+1)?dp[target]:-1); 
    }
}