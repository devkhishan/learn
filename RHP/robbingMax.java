import java.io.*; 
import java.util.*; 

class robbingMax{
    public static void main(String[] args){
        int[] houses = new int[]{11,12,13,11}; 

        for(int i=2;i<houses.length;i++){
            houses[i] = Math.max(houses[i]+houses[i-2], houses[i-1]); 
        }

        System.out.println(houses[houses.length-1]);
    }
}