import java.util.*; 
import java.io.*; 

class jumpProblem{
    public static void main(String[] args){
        int n = 5;  
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,2,1,0,4));

        int goal = arr.get(n-1); 
        
        for(int i=n-1;i>=0;i--) if (i+arr.get(i)>=goal) goal = i;
        
        System.out.print();
        

    }
}
