import java.io.*; 
import java.util.*; 
import javafx.util.Pair;
class testing{
    public static void main(String[] args){
        ArrayList<Pair<String,Integer>> pArray = new ArrayList<>(Arrays.asList(new Pair<String,Integer>("Student1",1))); 
       
        System.out.println(pArray.get(0).getKey());
    }
}