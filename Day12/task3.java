package Day12;

import java.util.* ;

// count of vow and cons 

public class task3 {
    public static void main(String[] args) {
        Scanner s =  new Scanner (System.in) ; 
        String str  = s.nextLine().replace(" ","")  ;

         char[]  a  =  str.toCharArray() ; 

         int vowelcount = 0 ; 
         int conscount = 0 ; 

         for (char i : a){
            if (isvowel(i)){
                // System.out.println("Vow :"+i);
                vowelcount++ ;
            }
            else
            {
                // System.out.println("Cons :"+i); 
                conscount++ ; 
            }
         }
        System.out.println( "vow : "+vowelcount) ; 
        System.out.println(  "cons :"+conscount) ;          
    }

    public static boolean isvowel(char c ){
        // c =  c.islower() ;
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='I' || c=='O' || c=='E' || c=='U'; 
    }
}
