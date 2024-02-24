import java.io.*; 
import java.util.*; 

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