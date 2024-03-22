import java.io.*; 
import java.util.*; 

class longestIncreasingSubsequence{
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3,4,-1,0,6,2,3));

    int[] dp = new int[numbers.size()]; 
    Arrays.fill(dp,1);
    int maxv = Integer.MIN_VALUE; 
    for(int i=1;i<numbers.size();i++){
        for(int j=0;j<i;j++){
            if(numbers.get(i)>numbers.get(j)){
                dp[i] = Math.max(dp[i],dp[j]+1);
            }
            if(dp[i]>maxv) maxv=dp[i];
        }
    

    }
    System.out.println(maxv);


}



