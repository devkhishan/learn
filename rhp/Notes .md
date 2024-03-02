[Reference Notes](https://drive.google.com/drive/folders/1gU9n_ig0U08Hz36rthJDOspvG0R7g3eT) provided by Dharshith <br>
[Reference Notes](http://surl.li/ptely) Session-4

# Date : 22 Jan 2024 (Day-1)

### Morning :

* Strongly Connected Components  
    * Kosaraju algorithm  
    * Tarjans algorithm (Not Learnt)

### Evening :

* Greedy Approach  
* Dynamic Programming  
    * Memoisation (Top Down Approach)  
    * Tabulation (Bottom Up Approach)  
* Branching 

1. Jumping Problem 
```Java 
public static void main(String[] args){
        int n = 5;  
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,2,1,0,4));

        int goal = arr.get(n-1); 
        
        for(int i=n-1;i>=0;i--) if (i+arr.get(i)>=goal) goal = i;
        
        System.out.print();
        

    }
```

2. Jumping Problem with Minimum Number of Steps

***

# Date : 23 Jan 2024 (Day-2)

### Morning :

1. Children Candies 
```Java 
public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,0,2)); 
        ArrayList<Integer> candies = new ArrayList<>(Collections.nCopies(arr.size(),1));

        int sum = 0;
        for(int i=1;i<arr.size();++i){
            if (arr.get(i)>arr.get(i-1)){
                candies.set(i, candies.get(i-1) + 1);kokokokokoko
            }
        }

        for(int i=arr.size()-2;i>=0;--i){
            if (arr.get(i)>arr.get(i+1)){
                candies.set(i, candies.get(i+1) + 1);
            }
        }

        for(int i : candies) sum += i; 
        System.out.println(sum); 

    }
```

2. Car Complete Circuit with Gas and Cost 
```Java
public static void main(String[] args){
        // Gas = [1,2,3,4,5]
        ArrayList<Integer> cost = new ArrayList<>(Arrays.asList(3,4,5,1,2));
        int gasSum = 0, costSum = 0;
        

        for(int i=1;i<=cost.size();++i){
            gasSum += i; 
            costSum += cost.get(i-1);
        }

        if (gasSum<costSum){
            System.out.println(-1); 
            return;
        }

        int total = 0, result = 0; 

        for(int i=1;i<=cost.size();++i){
            total = total + (i-cost.get(i-1)); 
            if (total<0){
                total = 0; 
                result = i;
            } 
        }
        System.out.println(result);
    }
```

3. Minimal Steps to Half Size 

```Java
public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,3,3,3,5,5,5,2,2,7)); 
    Map<Integer,Integer> map = new TreeMap<>(); 
        
    int ans = 0;
    for(int i : arr){
        map.put(i,map.getOrDefault(i,0)+1); 
    }
      
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
	list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
    int count = 0;
    for(Map.Entry<Integer,Integer> ma : list){
           
        count += ma.getValue(); 
        ans += 1;
        if (count>arr.size()/2){
            System.out.println(ans); 
            return;
        }
            
    }
}
```

4. Fractional Knapsack -> Calculate Value/Unit and add to knapsack until it gets full from the maximum element one by one.

5. Job Sequencing and Deadline 
```Java
public static void main(String[] args){
        int sum = 0; 

        ArrayList<Integer> profit = new ArrayList<>(Arrays.asList(35,30,25,20,15,12,5));
        ArrayList<Integer> deadLine = new ArrayList<>(Arrays.asList(3,4,4,2,3,1,2));

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(profit.size(),0)); 

        for(int i = 0;i<profit.size();++i){
           
            if (ans.get(deadLine.get(i))==0) ans.set(deadLine.get(i),profit.get(i)); 
            else if(ans.get(deadLine.get(i))<profit.get(i)) ans.set(deadLine.get(i), profit.get(i));
            else{
                int temp = deadLine.get(i)-1;
                while(temp!=0 && ans.get(temp)!=0) temp -= 1; 
                if (temp!=0){
                    ans.set(temp,profit.get(i)); 
                }
            }
        }

        for(int i=1;i<=Collections.max(deadLine);++i) sum+= ans.get(i);
        System.out.println(sum);


    }
```

*** 

# Date : 24 Jan 2024 (Day-3)

### Morning : 
Optimal Merge Pattern : 
    Use the lowest file size (array size) to merge priorly (2 arrays each time) and finally add up all the time complexities to get the optimal merging complexity 

Huffman Coding : 
    Use Huffman Tree for encoding and Decoding 

Mathematical Algorithm : 
    Note : For everything, ask how and why it is working (algorithms or methods) with real time usage and example

1. Trailing Zeros Factorial 
```Java 
    public static void main(String[] args){
        int n = 32; 
        int result = 0;

        while (n>=5){
            result += n/5; 
            n/=5; 
        }

        System.out.println(result);
    }
```

2. Sieve of Eratosthenes
```Java
    public static void main(String[] args){
        int n = 40; 

        Boolean[] prime = new Boolean[n]; 
        Arrays.fill(prime,true); 

        for(int i=2;i<Math.sqrt(n);i++){
            if (prime[i] == true){

                for(int j=i*i; j<n; j+=i){
                    prime[j] = false;
                }
            }
        }

        for(int k=2;k<n;k++) if (prime[k]==true) System.out.print(k+" "); 
        
    }
```

3. Euclid Algorithm for GCD  
```Java 
class euclidAlgo{

    public static int gcd(int a,int b){
        if (b==0) return a; 
        return gcd(b,a%b);
    }

    public static void main(String[] args){
        int a = 36,b = 24; 
        System.out.println(gcd(a,b));
    }
}
```

4. GCD of One 
```Java
// Find size of the largest subset with gcd = 1

class gcdOfOne{
    public static int gcd(int a,int b){
        if (b==0) return a; 
        return gcd(b,a%b); 
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,8,3,2)); 
        
        int result = gcd(arr.get(0),arr.get(1)); 

        for(int i=1;i<arr.size();++i){
            result = gcd(result,arr.get(i)); 
            if (result == 1){
                System.out.println(arr.size()); 
                return;
            }
        }
        System.out.println(-1); 
    }
}
```
### Evening : 

1. Jumbled Integer 
```Java
class jumbledInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        // 6 7 6 
        while(n>=10){
            int unit = n%10; 
            n/=10; 
            if (Math.abs(unit-n%10)>1){
                System.out.println(false); 
                return;
            }
             
        }
        System.out.println(true);
    }
}
```

2. Prime Factorization 
```Java 
public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        for(int div = 2; div*div <= n; div++){
            while(n%div==0){
                n = n/div;
                System.out.print(div+" "); 
            }
        }

        if(n!=1) System.out.println(n); 
}
```

3. Combinations NCR 
```Java 
class combinationsNCR{
    public static void main(String[] args){
        int n = 4; 
        int r = 3; 
        int result = n;
        if(r==n-1 || r==1){
            System.out.println(n); 
            return; 
        }
        for(int i=2;i<=r;i++){
            result  = (result*(n-i+1))/i;
        }

        System.out.println(result);
    }
}
```

*** 

# Date : 27 Jan 2024 (Day-4)

### Morning : 

1. Fibonacci (Tabulation)
```Java
class fibonacci{

    public static int fib(int n){
        ArrayList<Integer> number = new ArrayList<>(); 
        number.add(0); 
        number.add(1); 

        for(int i=2;i<=n;i++){
            number.add(number.get(i-1)+number.get(i-2));
        }
        return number.get(n); 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        System.out.println(fib(n)); 
    }
}
```
* Bitwise Operations 
    * Find Bit 
    * Set Bit 
    * Clear Bit

 
 
2. Max Stock Profit 
```Java 
class maxStockProfit{
    public static void main(String[] args){
        int[] price = new int[]{7,1,5,3,6,4}; 

        int maxProfit = 0, minPrice = price[0]; 

        for(int i=1;i<price.length;++i){
            if (price[i]<minPrice) minPrice = price[i]; 
            else maxProfit = Math.max(maxProfit, price[i] - minPrice); 
        }

        System.out.println(maxProfit);
    }
}
```

3. Minimum Steps Cost to reach Destination (Bottum Up DP)
```Java
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
```

4. Robbing Houses with Maximum Profit (No Adjacent)
```Java 
class robbingMax{
    public static void main(String[] args){
        int[] houses = new int[]{11,12,13,11}; 

        for(int i=2;i<houses.length;i++){
            houses[i] = Math.max(houses[i]+houses[i-2], houses[i-1]); 
        }

        System.out.println(houses[houses.length-1]);
    }
}
```

### Evening : 

5. Bit Masking - 2 Employes working at same time

6. Longest Common Subsequence 
```Java 
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
```

*** 

# Date : 29 Jan 2024 (Day-5)

### Morning :

1. Edit Distance 

  r o s       
h       5
o       4
r       3
s       2
e 3 2 1 1
  3 2 1 0

If char equals get from top diagonal else min of up,down,topDiagonal

```Java
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
    ```
2. Coin Changing 

```Java
public static void main(String[] args){
        ArrayList<Integer> coins = new ArrayList<>(Arrays.asList(1,2,5)); 
        int target = 11; 

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
```

3. Coin Changing Possible Combinations 

```Java 
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
```

4. Subset Sum - True or False

```Java 
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
```

5. Differentiate a set into two halves with equal sum and print the sum, if not possible print false 

6. Longest Increasing Subsequence 

7. Longest Palindrome subsequence 

```cpp
int longestPalindromeSubsequence(string s){
    string s2 = s; 
    reverse(s2.being(),s2.end()); 
    return longestCommonSubsequence(s,s2); 
}

int minInsertions(string s){
    return s.length()-longestPalindromeSubsequence(s); 
}
```

# Date : 26 Feb 2024 (Day-1)

## Morning  :

1. Longest Common Subsequence -> String 

```Java 
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
```

2. Longest Palindromic Subsequence -> Reverse the string and perform LCS 

3. Longest Common Substring  -> Length and String

```Java 
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
```

4. Knapsack 

```Java 
import java.io.*; 
import java.util.*; 

class knapsack 
{ 
    public static int helper(int W, int wt[], int val[], int n, int[][] dp){
         if (n==0) return 0; 
         if (dp[n-1][W]!=-1) return dp[n-1][W];
         
         if (wt[n-1]>W) return helper(W,wt,val,n-1,dp);
         return (dp[n-1][W] = Math.max(helper(W,wt,val,n-1,dp),val[n-1]+helper(W-wt[n-1],wt,val,n-1,dp)));
    }
    public static void main(String[] args) 
    { 
        int W=4;
        int wt[]=new int[]{4,5,1}, val[] = new int[]{1,2,3}; 
        int n=3;
        int[][] dp = new int[n][W+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        System.out.println(helper(W,wt,val,n,dp));
    } 
}
```

5. Leetcode 174 

6. Matrix Chain Multiplication  

                ABC 
            /          \
        (AB)C          A(BC)
       /      \      /       \
      AB       C    A        BC 
     /  \                   /  \   
    A    B                 B    C

example : 
arr  = {4 2 3 2}

For window-size = 2,
left = 1 
right = 2 

4 | 2 | 3 | 2 
  L   K   R

arr[L-1] x arr[K] x arr[R] 

# Date : 27 Feb 2024 (Day-2)

## Morning  :

1. Kaden's Algorithm 

```Java 
long maxSubarraySum(int arr[], int n){
    
        long macs = arr[0]; 
        long curr = arr[0];
        for(int i=1;i<n;i++){
            if (curr<0) curr = 0;
            curr += arr[i]; 
            macs = Math.max(curr,macs);
        }
        
        return macs;
        // Your code here
        
    }
``` 

2. Leetcode 1020 - BFS

3. Leetcode 130 - BFS

# Date : 28 Feb 2024 (Day-3)

## Morning  :

1. Class Complexity : **9:00 A.M.**
    - Polynomial := Deterministic Time
        * Linear Search - *O(n)* 
        * Binary Search - *O(log n)* 
        * Merge Sort - *O(n log n)* 
        * Matrix Multiplication - *O(n<sup>3</sup>)*
    - Exponential := Non-Deterministic Time 
        * 0/1 Knapsack - *O(2<sup>n</sup>)* 
        * Walting 
        * Graph Color Codes

    - P (Polynomial)
        * Tractable := You can find the solution and verify the solution then it is said to be Tractable
        * Ex : GCD (Euclid's Algorithm)
    - NP (Non-Polynomial := Non-Deterministic)
        * It's difficult to find the solution but it's easy to verify
        * Ex : 0/1 Knapsack
    - CoNP (Complement of Non-Polynomaial)
        * If X is the problem that can be solved through NP, then X' should also exists to make the problem to be termed as coNP
        * Ex : Prime Number (We are checking for the false first i.e., whether the number is divisible by its predecors  to return the true)
    - NP hard 
        * Satisfiability 
        * Reducability - If A and B are two problems, where if it possible to solve A with the help of algo used to solve B
    - NP Complete

<svg width="400" height="200">
  <circle cx="100" cy="100" r="60" stroke="white" stroke-width="2" fill="none" />
  <circle cx="70" cy="100" r="20" stroke="white" stroke-width="2" fill="none" />
  <circle cx="190" cy="100" r="60" stroke="white" stroke-width="2" fill="none" />
  <text x="95" y="135" font-size="14" fill="white">NP</text>
  <text x="65" y="105" font-size="14" fill="white">P</text>
  <text x="140" y="90" font-size="14" fill="white">N</text>
  <text x="140" y="105" font-size="14" fill="white">P</text>
  <text x="140" y="120" font-size="14" fill="white">C</text>
  <text x="170" y="100" font-size="14" fill="white">NP Hard</text>
</svg>

2. Tries : **10:00 A.M.**
    - Prefix Tree 
    - Digital Tree
    - Retrieval Tree

  Why Tries not Trees ? 
    * Children 'K' or 'N'
    * Tries DS := K-ary Tree
    * In pictorial representation the root node will always be null
    * All common prefixes will have shared memory space
    * Time Complexities 
        - Binary Tree - *O(n)* 
        - AVL Tree - *O(log n)* 
        - Tries - *O(L)* where L => Length of the word 

sideNote : Traversal on trees occurs in same manner, actions on traversal defines whether it is pre,post or in order traveresal

3. Trie Implementation  

```Java 
class Trie {
    Node root;

    public Trie() {
        root = new Node();  
    }
    
    public void insert(String word) {
         root.insert(word,0);
    }
    
    public boolean search(String word) {
        return root.search(word,0); 
    }
    
    public boolean startsWith(String prefix) {
        return root.startsWith(prefix,0);
    }

    class Node{
        Node[] nodes; 
        boolean EOW; 
        Node(){
            nodes = new Node[26]; 
      
        }

        private void insert(String word,int index){
            if (index==word.length()) return;
            int i = word.charAt(index) - 'a'; 
            if (nodes[i]==null) nodes[i] = new Node(); 

            if (index==word.length()-1) nodes[i].EOW = true;
            nodes[i].insert(word,index+1);
        }

        private boolean search(String word, int index){
            Node node = nodes[word.charAt(index) - 'a'];
            if(node==null) return false;  
            if (index == word.length()-1) return node.EOW; 
            return node.search(word,index+1); 
        }

        private boolean startsWith(String prefix, int index){
            if (index == prefix.length()) return true;
            Node node = nodes[prefix.charAt(index) - 'a'];
            if(node==null) return false;  
            return node.startsWith(prefix,index+1); 
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
```

# Date : 29 Feb 2024 (Day-4)

## Morning  :

1. Tries with Dynamic Data Structures : **9:10 A.M.**

2. Leetcode 42 

```Java 
 public int trap(int[] height) {
        int[] leftMax = new int[height.length]; 
        int[] rightMax = new int[height.length]; 
        int leftTemp = 0, rightTemp = 0, ans = 0; 

        for(int i=0;i<height.length;i++){
            if (i==0) continue;
            leftTemp = Math.max(leftTemp,height[i-1]); 
            leftMax[i] = leftTemp; 

            rightTemp = Math.max(rightTemp,height[height.length-i]);
            rightMax[height.length-i-1] = rightTemp;
        }

        for(int i=0;i<height.length;i++){
            if(leftMax[i]<height[i] || rightMax[i]<height[i]) continue; 
            ans += Math.min(leftMax[i],rightMax[i]) - height[i]; 
        }

        return ans; 
 }
```

# Date : 1 Mar 2024 (Day-5)

## Morning  :

1. Graph (Revision - Theory) : **9:00 A.M.**

A grandchild node requires the parent node in order to contact with the grandparent node in Trees and this is solved by graphs where a node can connect with any other node independent of any other intermediate nodes.

Eg: Used in Social Media Networks, Google Maps

Two parts of graphs are : 
    - Vertex 
    - Edge

Types of Graph Representation : 
    - Adjaceny Matrix [ Vertex x Vertex ]
    - Adjacency List ( Most efficient form )
    - Edge List Graph [ { Relation1(Source,Destination,Weight) .... RelationN } ]
    - Implicit Graph []

Based on Edges : 
    - Directed Graph 
    - Undirected Graph

Other Types : 
    - Cyclic Graph 
    - Acylic Graph
    - Connected Graph => No isolated vertex
    - Disconnected Graph 
    - Complete Graph => Each and every node is connected to every other node in a cyclic graph 

**[ Angle of vertex = No. of edges entering the vertex + No. of edges leaving the vertex ]**

If you are given a **disconnected graph** then the better approach to solve the question is to **adjacency matrix**.

*Time : 9:20 A.M. -> Completed Leetcode POTD + Graph Theory*

*Time : 10:20 A.M. -> Done LeetCode 23 based on Priority Queue (Merge K Sorted Linked List)*

*Time : 11:20 A.M. -> Done Edge List Graph Implementation in Java*

*Time : 11:40 A.M. -> Learnt to use comparator in Java used in Leetcode 23*

*Time : 12:50 P.M. -> Learnt Djikstra in Theory and Tried DFS in graphs*

**[ Visited will only be used on Traversal methods in graphs whereas it will not be used in Trees ]**

## Evening : 

*Time : 1:40 P.M. -> Seems like it would take much time and patience to solve djikstra hence skipping to the next one*

*Time : 2:10 P.M. -> Completed Skillrack DC and DT.  Revised Prims and Kruskals Theoretically*

*Time : 2:40 P.M. -> Calling the day*

# Date : 2 Mar 2024 (Day-6)

## Morning  :

1. Back Tracking - Problem Explanation *Time : 9:10 A.M.*