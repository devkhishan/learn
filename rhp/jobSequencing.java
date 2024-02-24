import java.io.*; 
import java.util.*; 

class jobSequencing{
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
}