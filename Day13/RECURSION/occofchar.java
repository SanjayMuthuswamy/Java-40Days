package RECURSION;
import java.util.* ; 

public class occofchar {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in ) ; 
        String str =  s.nextLine() ; 
        char ch = s.nextLine().charAt(0) ; 

        if (str.contains(String.valueOf(ch))) { System.out.println(countOcc(str ,  ch ,  str.length())); }
        
    }

    public static int countOcc(String str , char ch, int len){
        
        if(len == 0 ) return 0;
      
        if (str.charAt(len-1) == ch){ 
            return 1 + countOcc(str, ch, len-1) ; 
        }  
        else{
            return countOcc(str, ch,len-1) ; 
        }
     
         
    }
}
