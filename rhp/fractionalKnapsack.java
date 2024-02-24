import java.io.*; 
import java.util.*; 

class fractionalKnapsack{
    public class structure{
        public int price,weight;
        public float pricePerWeight;

        structure(int _price, int _weight, float _pricePerWeight){
            price = _price; 
            weight = _weight; 
            pricePerWeight = _pricePerWeight; 
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> price = new ArrayList<>(Arrays.asList(21,24,12,40,30));
        ArrayList<Integer> weight = new ArrayList<>(Arrays.asList(7,4,6,5,6)); 
        int w = 20;
        structure[] struct = new structure[price.size()];

        for(int i=0;i<price.size();++i) struct[i] = new structure(price[i],weight[i],Float.parseFloat(price[i]/weight[i]));
    }
}