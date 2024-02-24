import java.io.*; 
import java.util.*; 

class huffman{
    public static void main(String[] args){
        String s = "AABCDEBBBAE";
        Set<Character> unique = new HashSet<>(); 
        ArrayList<Integer> frequencies = new ArrayList<>(); 
        for(char c : s.toCharArray()){
            unique.add(c);

        }

        for(char ch : unique){
            System.out.println(ch);
        }
    }
}