import java.io.*; 
import java.util.*; 

class coinChangingPossibilities{
    public static void main(String[] args){
        ArrayList<Integer> coins = new ArrayList<>(Arrays.asList(1,2,5)); 
        int target = 5; 
       
        int[] dp = new int[target+1]; 

        dp[0] = 1; 

        for(int i=0;i<coins.size();i++){
            for(int j=0;j<=target;j++){
                if (coins.get(i)<=j) dp[j] = dp[j]+dp[j-coins.get(i)];
            }
        }
        System.out.println(dp[target]);
    }
}

// target = 5
//   0 1 2 5
// 0 1 1 1 1
// 1 0  
// 2 0
// 3 0
// 4 0
// 5 0


// [1, 2, 5]
//   0 1 2 3 4 5 
// 0 1 0 0 0 0 0
// 1 1 1 1 1 1 1
// 2 1 2 2 
// 5 1 2 2 