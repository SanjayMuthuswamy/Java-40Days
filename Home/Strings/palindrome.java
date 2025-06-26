package Strings;
import java.util.* ; 

public class palindrome {
    public static void main(String[] args) {
        Scanner s =  new Scanner (System.in) ; 
        
        String str =  s.nextLine() ; 
        int left = 0 ; 
    
        int right = str.length() -1 ; 
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        while (left<right){
            if (str.charAt(left) != (str.charAt(right))){
                System.out.println("Not a Palindorme");
                return; 
            }
            left++ ; 
            right-- ;
        }

        System.out.println("Planidrome");
    }
}
