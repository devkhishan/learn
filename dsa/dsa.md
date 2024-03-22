# Longest Increasing Subsequence (LIS) 

## Length of LIS

### Recursion 
```Java 
class Solution {
    static int lis(int index, int prev, int[] nums, int n){ 
        // Base Condition
        if(index==n) return 0; 
        
        // Take | Not Take
        int notTake = 0 + lis(index+1, prev, nums, n); 
        int take=0;
        if(prev == -1 || nums[index] > nums[prev]){
            take = 1 + lis(index+1, index, nums, n); 
        }

        // Return Length
        return Math.max(take, notTake); 
    }
    public int lengthOfLIS(int[] nums) { 
        int[][] dp = new int[nums.length][nums.length+1]; 
        for(int[] arr : dp){
            Arrays.fill(arr, -1); 
        }
        return lis(0,-1,nums,nums.length); 
    }
}
```

### Memoization
```Java
class Solution {
    static int lis(int index, int prev, int[] nums, int n, int[][] dp){ 
        if(index==n) return 0; 
        if(dp[index][prev+1]!=-1) return dp[index][prev+1]; 
        int notTake = 0 + lis(index+1, prev, nums, n,dp); 
        int take=0;
        if(prev == -1 || nums[index] > nums[prev]){
            take = 1 + lis(index+1, index, nums, n, dp); 
        }

        return dp[index][prev+1] = Math.max(take, notTake); 
    }
    public int lengthOfLIS(int[] nums) { 
        int[][] dp = new int[nums.length][nums.length+1]; 
        for(int[] arr : dp){
            Arrays.fill(arr, -1); 
        }
        return lis(0,-1,nums,nums.length,dp); 
    }
}
``` 
### Tabulation - Optimized => O(n<sup>2</sup>)
```Java 
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length; 
        int macs = 1;
        int[] dp = new int[n]; 
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){ 
                if (nums[j]<nums[i])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            } 
            macs = Math.max(dp[i], macs); 
        } 
        return macs;
    }
}
```


