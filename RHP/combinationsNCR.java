import java.io.*; 
import java.util.*; 

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