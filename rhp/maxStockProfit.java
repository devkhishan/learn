import java.io.*; 
import java.util.*; 

class maxStockProfit{
    public static void main(String[] args){
        int[] price = new int[]{7,1,5,3,6,4}; 

        int maxProfit = 0, minPrice = price[0]; 

        for(int i=1;i<price.length;++i){
            if (price[i]<minPrice) minPrice = price[i]; 
            else maxProfit = Math.max(maxProfit, price[i] - minPrice); 
        }

        System.out.println(maxProfit);
    }
}