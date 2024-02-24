import java.io.*; 
import java.util.*; 

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