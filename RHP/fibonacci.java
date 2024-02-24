import java.io.*; 
import java.util.*; 

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