package Day12;

import java.lang.reflect.Array;

public class task7 {
    public static void main(String[] args) {
        java.util.Scanner s  =  new java.util.Scanner(System.in) ; 

        String str =  s.nextLine().toLowerCase() ;
        char[]  a = str.toCharArray(); 

        for (int i=0 ; i < a.length ;i++){
            for (int j=a.length-1 ; j>=0 ; j--){
                if (isvowel(a[i] , a[j])){  
                  char temp = a[i]  ; 
                  a[i] =  a[j]; 
                  a[j]= temp ; 
                  i++ ; 
                  j-- ;
                  break ; 
                }
            }
        }
        System.out.println(new String(a));
    }
    public static boolean isvowel(char c , char d){
        // return  c=='a' || c=='e' || c=='i' || c=='o' || c=='u'  ; 
        if ((c == 'a' || c=='e' || c=='i' || c=='o' || c=='u') && ( d=='a' || d=='e' || d=='i' || d=='o' || d=='u'  )) {
            return true  ; 
        }
        return false ; 
    }
}
