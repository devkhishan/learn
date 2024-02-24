import java.io.*; 
import java.util.*; 

class subsetTrue{
    public static void main(String[] args){
        ArrayList<Integer> coins = new ArrayList<>(Arrays.asList(2,2,5)); 
        int target = 5; 
       
        Boolean[] dp = new Boolean[target+1], temp = new Boolean[target+1];
        Arrays.fill(dp,false); 
        dp[0] = true; 

        for(int i=0;i<coins.size();i++){
            temp = dp.clone(); 
            for(int j=0;j<=target;j++){
                if (coins.get(i)<=j) dp[j] = dp[j] || temp[j-coins.get(i)];
            }
        }
        System.out.println(dp[target]);
    }
}