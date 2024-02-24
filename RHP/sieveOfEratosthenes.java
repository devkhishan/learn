import java.io.*; 
import java.util.*; 

class sieveOfEratosthenes{
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
}