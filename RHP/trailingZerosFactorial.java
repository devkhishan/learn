import java.io.*; 
import java.util.*; 

class trailingZerosFactorial{
    public static void main(String[] args){
        int n = 32; 
        int result = 0;

        while (n>=5){
            result += n/5; 
            n/=5; 
        }

        System.out.println(result);
    }
}