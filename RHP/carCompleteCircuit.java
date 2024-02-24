import java.io.*; 
import java.util.*; 

class carCompleteCircuit{
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
}