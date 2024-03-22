import java.util.*;

class symmetricVoid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        int left = n-1; 
        int right = n; 

        char[] answer = new char[n*2]; 
        Arrays.fill(answer,'*'); 

        // first line 
        System.out.println(new String(answer)); 

        // top pattern
        for(int i=1;i<n;i++){
            answer[left--] = ' '; 
            answer[right++] = ' '; 
            System.out.println(new String(answer));
        } 

        // bottom pattern
        for(int i=n;i<n*2;i++){
            answer[left++] = '*'; 
            answer[right--] = '*'; 
            System.out.println(new String(answer)); 
        }

        
    }
}