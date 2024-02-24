import java.io.*; 
import java.util.*; 

class childrenCandies{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,0,2)); 
        ArrayList<Integer> candies = new ArrayList<>(Collections.nCopies(arr.size(),1));

        int sum = 0;
        for(int i=1;i<arr.size();++i){
            if (arr.get(i)>arr.get(i-1)){
                candies.set(i, candies.get(i-1) + 1); 
            }
        }

        for(int i=arr.size()-2;i>=0;--i){
            if (arr.get(i)>arr.get(i+1)){
                candies.set(i, candies.get(i+1) + 1);
            }
        }

        for(int i : candies) sum += i; 
        System.out.println(sum); 

    }
}