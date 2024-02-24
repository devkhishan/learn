import java.io.*; 
import java.util.*; 

class minimalStepsHalfSize{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,3,3,3,5,5,5,2,2,7)); 
        Map<Integer,Integer> map = new TreeMap<>(); 
        
        int ans = 0;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1); 
        }
      
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
	    list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        int count = 0;
        for(Map.Entry<Integer,Integer> ma : list){
           
            count += ma.getValue(); 
            ans += 1;
            if (count>arr.size()/2){
                System.out.println(ans); 
                return;
            }
            
        }
    }
}