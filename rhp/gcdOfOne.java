import java.io.*; 
import java.util.*; 

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